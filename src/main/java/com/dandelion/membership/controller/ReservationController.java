package com.dandelion.membership.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.dandelion.membership.exception.MembershipException;
import com.dandelion.membership.service.ReservationService;

@Controller
@RequestMapping(value ="Reservation")
public class ReservationController {
	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired
	private ReservationService reservationService;
		
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "Show", method = RequestMethod.GET)
	public String show() {
		return "calendar";
	}
	
	@RequestMapping(value = "Reserve", method = RequestMethod.GET)
	public String reserve(WebRequest webRequest) throws JSONException {
		return "reserve";
	}
	
	
	@RequestMapping(value = "Query", method = RequestMethod.GET)
	public ModelAndView selectEvent(WebRequest webRequest) throws JSONException {
		Long from = Long.valueOf(webRequest.getParameter("from"));
		Long to = Long.valueOf(webRequest.getParameter("to"));
		String result = reservationService.selectEvent(from, to);
		return new ModelAndView("json", "j", result.toString());
	}
	
	@RequestMapping(value = "Submit", method = RequestMethod.POST)
	public String ReservationSubmit(WebRequest request) throws ParseException, MembershipException {
		Long memberId = Long.valueOf(request.getParameter("memberId"));
		String reservation = request.getParameter("reservation");
		String[] strings = reservation.split("-");
		strings[0].trim();
		strings[1].trim();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date startDate = format.parse(strings[0]);
		Date startEnd = format.parse(strings[1]);
		boolean b = reservationService.reservationSubmit(memberId, startDate, startEnd);
		
		return "home";
	}
	
	
	public static void main(String[] args) throws ParseException {
		System.out.println(new Date(1383235200000L));
		float a = 1.000f;
		System.out.println(1 == a);
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String  dd = format.format(d);
		d = format.parse(dd);
		System.out.println(d);
	}
}
