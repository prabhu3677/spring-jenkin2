package com.example.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkin2ApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkin2ApplicationTests.class);

	@Test
	public void contextLoads() {
	
		logger.info("Test case executing......");
		logger.info("Test case executing second log statement......");
		logger.info("Test case executing thrird log statement.......");
		
		assertEquals(true, true);
		
	}

}
