package com.dandelion.membership.dao.data;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.dandelion.membership.dao.model.Applicant;

public interface MembershipMapper {

	public int insertApplicant(Applicant applicant);
	
	@Select(value="Select * from tb_applicant")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectApplicant();
	
	
	
}
