package com.dandelion.membership.hackathonmodel;

import java.util.List;

public class DianpingVeneusResponse {
	private String status;
	private int total_count;
	private int count;
	
	private List<DianpingBusinessResponse> businesses;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<DianpingBusinessResponse> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(List<DianpingBusinessResponse> businesses) {
		this.businesses = businesses;
	}

	
}
