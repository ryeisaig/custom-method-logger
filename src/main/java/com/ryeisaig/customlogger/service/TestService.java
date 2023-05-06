package com.ryeisaig.customlogger.service;

import org.springframework.stereotype.Service;

import com.ryeisaig.customlogger.annotation.LogStartEnd;

@Service	
public class TestService {
	
	@LogStartEnd
	public String testLog(String name, String countryOrigin) {
		return new StringBuilder()
				.append("Hello ")
				.append(name)
				.append(" from ")
				.append(countryOrigin)
				.append("!")
				.toString();
	}
	
	@LogStartEnd
	public void testLogNoReturn(String name, String countryOrigin) {
	}
}
