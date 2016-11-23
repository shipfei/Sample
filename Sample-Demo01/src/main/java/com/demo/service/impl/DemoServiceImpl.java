/**
 * 
 */
package com.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DemoDao;
import com.demo.service.DemoService;

/**
 * @author shipengfei
 *
 */

@Service
public class DemoServiceImpl implements DemoService {
	
	final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Autowired
	private DemoDao demoDao;

	@Override
	public String testService() {
		demoDao.testDao();
		logger.info("DemoServiceImpl: from service.");
		return "";
	}

	public DemoDao getDemoDao() {
		return demoDao;
	}

	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

}
