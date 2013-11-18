package com.dandelion.membership.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.membership.constant.Constant;
import com.dandelion.membership.dao.data.MembershipMapper;
import com.dandelion.membership.dao.model.CalendarEvent;
import com.dandelion.membership.dao.model.Reservation;
import com.dandelion.membership.exception.MembershipException;
import com.dandelion.membership.exception.WebserviceErrors;

@Service
public class ReservationService {
	private static final Logger logger = LoggerFactory
			.getLogger(ReservationService.class);
	@Autowired
	private MembershipMapper membershipMapper;
	
	
	@Transactional(rollbackFor = Exception.class)
	public boolean reservationSubmit(Long memberId, Date start, Date end) throws ParseException, MembershipException {
		Reservation tempReservation = new Reservation();
		tempReservation.setMemberidfk(memberId);
		tempReservation.setStart(start);
		tempReservation.setEnd(end);
		tempReservation.setStatus("申請中");
		tempReservation.setCreateddate(new Date());
		tempReservation.setModifieddate(new Date());
		
		Reservation r = membershipMapper.selectReservationByMemberIdAndDate(memberId, start, end);
		if (r !=null ) {
			return false;
		}
		membershipMapper.insertReservation(tempReservation);
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String  dd = format.format(start);
		Date startDay = format.parse(dd);
		Date endDay = new Date(startDay.getTime() + Constant.DAY_TIME);
		
		List<Reservation> reservations = membershipMapper.selectReservationByDate(startDay, endDay);
		int reservationSize = reservations.size();
		logger.info(String.valueOf(reservationSize));
		if (reservationSize > 0) {
			List<CalendarEvent> events = membershipMapper.selectCalendarEventByStartAndEnd(startDay, endDay);
			if( events.size() ==0 ) {
				throw new MembershipException(WebserviceErrors.CALENDAREVENT_NOT_EXIST, WebserviceErrors.CALENDAREVENT_NOT_EXIST_MESSAGE);
			}
			CalendarEvent calendarEvent = events.get(0);
			if (reservationSize <= 2) {
				calendarEvent.setCssclass("event-warning");
				membershipMapper.updateCalendarEvent(calendarEvent);
			}
			if (reservationSize > 2) {
				calendarEvent.setCssclass("event-important");
				calendarEvent.setUrl("###");
				membershipMapper.updateCalendarEvent(calendarEvent);
			}
		}
		return true;
	}

	@Transactional(rollbackFor = Exception.class)
	public String selectEvent(Long from, Long to) throws JSONException {

		Float days = Float.valueOf((to - from) / Constant.DAY_TIME);
		logger.info("query days : " + String.valueOf(days));

		List<CalendarEvent> calendarEvents = membershipMapper
				.selectCalendarEventByStartAndEnd(new Date(from), new Date(to));
		if (days > 7 && days <= 31) {
			boolean b = false;
			if (calendarEvents != null) {
				if (calendarEvents.size() >= days) {
					b = true;
				}
			}
			if (!b) {
				for (int i = 0; i < days; i++) {
					CalendarEvent tempCalendarEvent = new CalendarEvent();
					Long startTime = from + i * Constant.DAY_TIME;
					Long endTime = from + (i + 1) * Constant.DAY_TIME
							- Constant.Hour_TIME;
					tempCalendarEvent.setTitle("Empty");
					tempCalendarEvent.setCssclass("event-success");
					tempCalendarEvent
							.setUrl("../Reservation/Reserve?startTime="
									+ startTime + "&endTime=" + endTime);
					tempCalendarEvent.setStart(new Date(startTime));
					tempCalendarEvent.setEnd(new Date(endTime));
					tempCalendarEvent.setCreateddate(new Date());
					tempCalendarEvent.setModifieddate(new Date());
					membershipMapper.insertCalendarEvent(tempCalendarEvent);

					logger.info(new Date(startTime).toLocaleString());
				}

				calendarEvents = membershipMapper
						.selectCalendarEventByStartAndEnd(new Date(from),
								new Date(to));
			}
		}

		JSONObject result = new JSONObject();
		JSONArray array = new JSONArray();
		for (CalendarEvent calendarEvent : calendarEvents) {
			JSONObject json = new JSONObject();
			Long startTime = calendarEvent.getStart().getTime();
			Long endTime = calendarEvent.getEnd().getTime();
			json.put("id", calendarEvent.getId());
			json.put("title", calendarEvent.getTitle());
			json.put("url", calendarEvent.getUrl());
			json.put("class", calendarEvent.getCssclass());
			json.put("start", startTime);
			json.put("end", endTime);
			array.put(json);
		}
		result.put("success", 1);
		result.put("result", array);

		return result.toString();
	}
}
