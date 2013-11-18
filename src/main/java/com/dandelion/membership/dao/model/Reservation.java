package com.dandelion.membership.dao.model;

import java.util.Date;

public class Reservation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.ID
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.memberIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Long memberidfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.fieldIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private String fieldidfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.start
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Date start;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.end
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Date end;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.status
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.weather
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private String weather;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.event
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private String event;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.CreatedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Date createddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_reservation.ModifiedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	private Date modifieddate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.ID
	 * @return  the value of tb_reservation.ID
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.ID
	 * @param id  the value for tb_reservation.ID
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.memberIDFK
	 * @return  the value of tb_reservation.memberIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Long getMemberidfk() {
		return memberidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.memberIDFK
	 * @param memberidfk  the value for tb_reservation.memberIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setMemberidfk(Long memberidfk) {
		this.memberidfk = memberidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.fieldIDFK
	 * @return  the value of tb_reservation.fieldIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public String getFieldidfk() {
		return fieldidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.fieldIDFK
	 * @param fieldidfk  the value for tb_reservation.fieldIDFK
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setFieldidfk(String fieldidfk) {
		this.fieldidfk = fieldidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.start
	 * @return  the value of tb_reservation.start
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.start
	 * @param start  the value for tb_reservation.start
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.end
	 * @return  the value of tb_reservation.end
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.end
	 * @param end  the value for tb_reservation.end
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.status
	 * @return  the value of tb_reservation.status
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.status
	 * @param status  the value for tb_reservation.status
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.weather
	 * @return  the value of tb_reservation.weather
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.weather
	 * @param weather  the value for tb_reservation.weather
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.event
	 * @return  the value of tb_reservation.event
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.event
	 * @param event  the value for tb_reservation.event
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.CreatedDate
	 * @return  the value of tb_reservation.CreatedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Date getCreateddate() {
		return createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.CreatedDate
	 * @param createddate  the value for tb_reservation.CreatedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_reservation.ModifiedDate
	 * @return  the value of tb_reservation.ModifiedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public Date getModifieddate() {
		return modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_reservation.ModifiedDate
	 * @param modifieddate  the value for tb_reservation.ModifiedDate
	 * @mbggenerated  Mon Nov 18 21:45:04 CST 2013
	 */
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
}