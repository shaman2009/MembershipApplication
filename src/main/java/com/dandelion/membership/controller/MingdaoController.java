package com.dandelion.membership.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping(value = "/api/mingdao")
public class MingdaoController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> loginAnonymous(@RequestParam(value = "j", required = true) String j ,WebRequest request) throws Exception {
		JSONObject json = new JSONObject(j);
		return new ResponseEntity<String>("Hi", HttpStatus.OK);
	}
}
