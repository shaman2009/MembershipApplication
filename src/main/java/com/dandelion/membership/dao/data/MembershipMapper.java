package com.dandelion.membership.dao.data;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.dandelion.membership.dao.model.Applicant;

public interface MembershipMapper {

	public int insertApplicant(Applicant applicant);
	
	public int updateApplicant(Applicant applicant);
	
	@Select(value="Select * from tb_applicant t where t.ismember = 0")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectApplicant();
	
	@Select(value="Select * from tb_applicant t where t.ismember = 1")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectMembers();
	
	@Select(value="SELECT * FROM tb_applicant t where t.applicantName = #{name} and t.ismember = 1 ;")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectMemberByName(String name);
	
	@Select(value="SELECT * FROM tb_applicant t where t.applicantName = #{0} and t.referrername = #{1}")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectMemberByNameandReferrername(String name, String referrername);
	
	@Select(value="SELECT * FROM tb_applicant t where t.applicantEmail = #{0}")
	@ResultMap("BaseApplicantResultMap")
	public List<Applicant> selectMemberByEmail(String email);
	
}
