package com.service;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/calls")
public class JsonService {

	private static volatile int count=0;
		
	/*@GET
    @Produces("application/json")
    public HashMap<String,String> getCalls() {
		count++;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("calls", ""+count);
		map.put("timestamp",Utils.getCurrentTime());
    	return map;
    }*/
	
	@GET
    @Produces("application/json")
    public Response getCalls() {
		count++;
		Response res = new Response();
		res.setCalls(count);
		res.setTimestamp(Utils.getCurrentTime());
    	return res;
    }
    
}
