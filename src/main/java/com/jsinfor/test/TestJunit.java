package com.jsinfor.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jsinfor.bean.Person;
import com.jsinfor.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)	
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestJunit {
	private static Logger logger = Logger.getLogger(TestJunit.class);
	@Autowired
	private PersonService personService;


	@Test
	public void test1() {
		List<Person> list = personService.selectAll();
		logger.info(JSON.toJSONString(list));
	}
}
