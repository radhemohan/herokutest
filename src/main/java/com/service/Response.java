package com.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

	private int calls;
	public int getCalls() {
		return calls;
	}
	public void setCalls(int calls) {
		this.calls = calls;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	private String timestamp;
	
}
