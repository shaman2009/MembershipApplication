package com.dandelion.membership.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="Reservation")
public class ReservationController {
private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "Show", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		
		return "calendar";
	}
}
