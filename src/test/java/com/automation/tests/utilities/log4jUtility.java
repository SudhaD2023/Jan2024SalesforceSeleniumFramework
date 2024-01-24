package com.automation.tests.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jUtility {
    private Logger log=null;
    private static log4jUtility ob=null;
    
    	private log4jUtility() {
    	 }
    	
    	public static log4jUtility getInstance() {
    		if (ob==null) {
    			ob =new log4jUtility();
    		}
    		return ob;
    		}
    	
    	public Logger getlogger() {
    		if(log==null)
    		log=LogManager.getLogger(log4jUtility.class);
    		return log;
    	}
//    	public void logInfoText(String Data) {
//    		log.info(Data);
//    	}
//    	public void logErrorText(String Data) {
//    		log.error(Data);
//    	}

}
