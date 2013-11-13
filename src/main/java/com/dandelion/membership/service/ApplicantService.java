package com.dandelion.membership.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.membership.dao.data.MembershipMapper;
import com.dandelion.membership.dao.model.Applicant;

@Service
public class ApplicantService {
	@Autowired
	private MembershipMapper membershipMapper;
	
	public void ApplicantSubmit(Applicant applicant){
		List<Applicant> list = membershipMapper.selectMemberByNameandReferrername(applicant.getApplicantname(), applicant.getReferrername());
		if(list.size() != 0) {
			return;
		}
		Date date = new Date();
		applicant.setModifieddate(date);
		applicant.setCreateddate(date);
		membershipMapper.insertApplicant(applicant);
		
	}
}
