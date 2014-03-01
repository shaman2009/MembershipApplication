package com.dandelion.membership.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import com.dandelion.membership.hackathonmodel.VeneusListResponse;
import com.dandelion.membership.service.DianpingService;

@Controller
@RequestMapping(value = "/api/dianping")
public class DianpingController {
	@Autowired
	private DianpingService dianpingService;
	@RequestMapping(value = "/veneus", method = RequestMethod.GET)
	public ResponseEntity<VeneusListResponse> getVeneus(@RequestParam(value = "j", required = false) String j ,WebRequest request) throws Exception {
		VeneusListResponse veneusListResponse = dianpingService.getVeneus();
		return new ResponseEntity<VeneusListResponse>(veneusListResponse, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/accesstoken", method = RequestMethod.GET)
	public ResponseEntity<String> getAccessToken(@RequestParam(value = "j", required = false) String j , HttpServletResponse response) throws Exception {
		response.addCookie(new Cookie("COOKIENAME", "The cookie's value"));
		return new ResponseEntity<String>("Accesstoken write success!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/finish", method = RequestMethod.GET)
	public String closeTab(@RequestParam(value = "j", required = false) String j , HttpServletResponse response) throws Exception {
		response.addCookie(new Cookie("COOKIENAME", "The cookie's value"));
		return "closetab";
	}
}
