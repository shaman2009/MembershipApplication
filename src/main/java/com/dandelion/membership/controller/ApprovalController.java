package com.dandelion.membership.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.dandelion.membership.dao.model.Applicant;
import com.dandelion.membership.service.ApprovalService;

@Controller
@RequestMapping(value="Approval")
public class ApprovalController {
	private static final Logger logger = LoggerFactory.getLogger(ApprovalController.class);
	
	@Autowired
	private ApprovalService approvalService;

	@RequestMapping(value = "Select")
	public ModelAndView selectApplicant(Locale locale, Model model, WebRequest request) {
		List<Applicant> list = approvalService.selectApplicant();
		model.addAttribute("Applicants",list);
		logger.info(String.valueOf(list.size()));
	    return new ModelAndView("approval");
	}
	
}
