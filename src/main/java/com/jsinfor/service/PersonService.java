package com.jsinfor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsinfor.bean.Person;
import com.jsinfor.dao.PersonMapper;
/**
 * Person 业务层
 * @author ZhuangWJ
 *
 */
@Service
public class PersonService {

	@Autowired
	PersonMapper personMapper;
	
	/**
	 * 查询person列表
	 * @return
	 */
	public List<Person> selectAll(){
		return personMapper.selectAll();
	}
	
	/**
	 * 根据id查询person对象
	 * @param id
	 * @return
	 */
	public Person findById(Integer id){
		return personMapper.findById(id);
	}

}
