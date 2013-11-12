package com.dandelion.membership.dao.data;

import com.dandelion.membership.dao.model.Applicant;
import com.dandelion.membership.dao.model.ApplicantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicantMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int countByExample(ApplicantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int deleteByExample(ApplicantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int insert(Applicant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int insertSelective(Applicant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	List<Applicant> selectByExample(ApplicantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	Applicant selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int updateByExampleSelective(@Param("record") Applicant record,
			@Param("example") ApplicantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int updateByExample(@Param("record") Applicant record,
			@Param("example") ApplicantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int updateByPrimaryKeySelective(Applicant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_applicant
	 * @mbggenerated  Tue Nov 12 22:44:00 CST 2013
	 */
	int updateByPrimaryKey(Applicant record);
}