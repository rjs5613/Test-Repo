package com.rajesh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.rajesh.student.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringTestApplication.class)
@WebAppConfiguration
public class SpringTestApplicationTests {

	@Autowired
	private StudentService studentService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testStudent() {
		Assert.assertTrue(studentService.findById(1).getName().equals("Rajesh"));
	}

}
