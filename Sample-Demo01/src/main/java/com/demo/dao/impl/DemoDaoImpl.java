/**
 * 
 */
package com.demo.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.demo.dao.DemoDao;

/**
 * @author shipengfei
 *
 */
@Repository
public class DemoDaoImpl implements DemoDao{
	
	final Logger logger = LoggerFactory.getLogger(DemoDaoImpl.class);
	
	@Override
	public String testDao() {
		logger.info("DemoDaoImpl: from dao.");
		return "";
	}

}
