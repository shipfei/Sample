/**
 * 
 */
package com.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shipengfei
 *
 */
public class SL4JTest {
	
	public static void main(String[] args) {
	    Logger logger = LoggerFactory.getLogger(SL4JTest.class);
	    logger.error("log....error!");
	    logger.warn("log....warn!");
	    logger.info("log....info!");
	    logger.debug("log....debug");
	  }

}
