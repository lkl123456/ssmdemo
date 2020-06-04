package com.jsinfor.dao;

import java.util.List;

import com.jsinfor.bean.Person;
/**
 * Person 映射
 *
 * @author ZhuangWJ
 *
 */
public interface PersonMapper {
	/**
	 * 查询person列表
	 * @return
	 */
	List<Person> selectAll();
	
	/**
	 * 根据id查询person对象
	 * @param id
	 * @return
	 */
	Person findById(Integer id);
	
}