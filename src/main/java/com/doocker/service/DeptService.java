package com.doocker.service;

import java.util.List;

import com.doocker.po.Dept;

/**
 * 部门业务接口
 * @author Administrator
 *
 */
public interface DeptService {
	//插入一条记录
	public Integer insertDept(Dept dept);
	//修改记录
	public Integer updateDept(Dept dept);
	//插入并修改记录
	public Integer updateAndInsert();
	public List<Dept> getAll();
}
