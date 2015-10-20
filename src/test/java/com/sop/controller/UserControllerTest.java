package com.sop.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext; 
import org.springframework.test.context.ContextConfiguration; 
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 
import org.springframework.test.context.web.WebAppConfiguration; 
import org.springframework.test.web.servlet.MockMvc; 
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.sop.Application;
import com.sop.dao.UserDao;

import static org.hamcrest.Matchers.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
/*
 @RunWith(SpringJUnit4ClassRunner.class) 
 @SpringApplicationConfiguration(classes = Application.class) 
 @ContextConfiguration(classes = MockServletContext.class) 
 @WebAppConfiguration 
 */
 public class UserControllerTest { 
	 
 	private MockMvc mvc; 
  
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserController userController;
	@Autowired
	private RequestMappingHandlerAdapter handlerAdapter;
	
 
 	@Before 
 	public void setUp() throws Exception { 
 	//	this.mvc = MockMvcBuilders.standaloneSetup(new UserController()).build(); 
 	} 
 
    @Test
    public void testCreateUser(){
    	
    }
}
