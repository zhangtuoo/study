package com.doocker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.mapper.DeptMapper;
import com.doocker.po.Dept;
import com.doocker.po.DeptExample;
import com.doocker.service.DeptService;


@Service(value="deptServiceImpl")
public class DeptServiceImpl implements DeptService {
	
	
	@Autowired
	private DeptMapper deptMapepr;

	@Override
	public Integer insertDept(Dept dept) {
		Dept dept1 = new Dept();
		dept1.setId(3);
		dept1.setDeptName("abcdef");
		//aop给数据访问层的mapper开启一个session
		this.updateDept(dept1);
		int a = 1/0;
		//aop给数据访问层的mapper开启一个session
		return this.deptMapepr.insert(dept);
		//成功session.commit()
		//失败session.rollback()
		
	}

	@Override
	public Integer updateDept(Dept dept) {
		//aop给数据访问层的mapper开启一个session
		return this.deptMapepr.updateByPrimaryKey(dept);
		//成功session.commit()
		//失败session.rollback()
	}

	//事务的原子性：修改一条和插入一条应该都成功，才算业务成功
	@Override
	public Integer updateAndInsert() {
		Dept dept = new Dept();
		dept.setId(2);
		dept.setDeptName("abcdef");
		//aop给数据访问层的mapper开启一个session
		this.updateDept(dept);
		Dept dept1 = new Dept();
		dept1.setDeptName("新加入");
		this.insertDept(dept);
		//成功session.commit()
		//失败session.rollback()
		return 1;
	}

	@Override
	public List<Dept> getAll() {
		return this.deptMapepr.selectByExample(new DeptExample());
	}

}
