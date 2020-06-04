package com.jsinfor.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * Person 实体bean 
 * 映射表 t_person  
 *
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id", example = "id")
	private Integer id;
	@ApiModelProperty(value = "人员名称", example = "人员名称")
    private String name;
	@ApiModelProperty(value = "人员年龄", example = "人员年龄")
    private Integer age;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    
    
   
    
}