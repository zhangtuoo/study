package com.doocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.po.Dept;
import com.doocker.service.DeptService;

@Controller
@RequestMapping("dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	@RequestMapping("list")
	@ResponseBody
	public List<Dept> getAllDept(){
		List<Dept> list = null;
		Dept dept = new Dept();
		dept.setDeptName("新增");
		Integer intt= deptService.insertDept(dept);
		return list;
	}
	
	
	
}
