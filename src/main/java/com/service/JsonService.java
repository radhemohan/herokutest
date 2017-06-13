package com.service;

import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/calls")
public class JsonService {

	private static volatile int count=0;
	
	@GET
    @Produces("application/json")
    public HashMap<String,String> getCalls() {
		count++;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("calls", ""+count);
		map.put("timestamp",new Date().toString());
    	return map;
    }
    
}
