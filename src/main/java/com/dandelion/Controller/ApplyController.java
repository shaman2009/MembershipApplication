package com.dandelion.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class ApplyController {
	private static final Logger logger = LoggerFactory.getLogger(ApplyController.class);
	
	@RequestMapping(value = "Apply", method = RequestMethod.GET)
	public String apply(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "apply";
	}
	@RequestMapping(value = "Dandelion", method = RequestMethod.POST)
	public String submit(Locale locale, Model model, WebRequest request) {
		logger.info("submit", "submit");
		String applicantName = request.getParameter("applicantName");
		String applyDate = request.getParameter("applyDate");
		String referrerName = request.getParameter("referrerName");
		
		logger.info(applicantName, applicantName);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
}
