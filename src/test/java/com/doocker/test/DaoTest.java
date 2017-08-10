package com.doocker.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doocker.po.Dept;
import com.doocker.service.DeptService;
import com.doocker.service.impl.DeptServiceImpl;

public class DaoTest {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml"); 
		DeptService deptService = (DeptService)app.getBean("deptServiceImpl"); 
		Integer insertDept = deptService.updateAndInsert(); 
		System.out.println(insertDept);
		//Dept selectByPrimaryKey = deptMapper.selectByPrimaryKey(1);
		//System.out.println(selectByPrimaryKey.getDeptName());
	}

}
