package com.dev.dao;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.dev.Application;
import com.dev.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class UserMapperTester extends AbstractTransactionalTestNGSpringContextTests {

	@Resource
	private UserMapper userMapper;
	
	@Test
	public void selectByPrimaryKey(){
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getUserName());
	}
}
