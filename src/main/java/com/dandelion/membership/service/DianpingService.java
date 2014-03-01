package com.dandelion.membership.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.dandelion.membership.hackathonmodel.VeneusListResponse;
import com.dandelion.membership.hackathonmodel.VeneusResponse;
import com.google.gson.Gson;

@Service
public class DianpingService {

	public VeneusListResponse getVeneus() {
		JSONObject json = new JSONObject();
		JSONArray array = new JSONArray();
		VeneusResponse veneus1 = new VeneusResponse();
		veneus1.setId("1");
		veneus1.setTitle("85°C");
		veneus1.setUrl("www.google.com");
		VeneusResponse veneus2 = new VeneusResponse();
		veneus2.setId("2");
		veneus2.setTitle("M记");
		veneus2.setUrl("www.baidu.com");
		Gson gson = new Gson();
		array.put(gson.toJson(veneus1));
		array.put(gson.toJson(veneus2));
		List<VeneusResponse> list = new ArrayList<VeneusResponse>();
		list.add(veneus1);
		list.add(veneus2);
		VeneusListResponse veneusListResponse = new VeneusListResponse();
		veneusListResponse.setVeneus(list);
		return veneusListResponse;
	}
	
}
