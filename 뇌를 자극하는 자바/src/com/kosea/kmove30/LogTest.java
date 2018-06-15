package com.kosea.kmove30;

import org.apache.log4j.Logger;

public class LogTest {
	private final Logger logger = Logger.getLogger(LogTest.class);
	public void printLog(String msg) {
		logger.info(msg);
		logger.debug(msg);
		
	}
	
	public static void main(String[] args) {
		
		LogTest logTest = new LogTest();
		logTest.printLog("로그 테스트중");
	} 
}
