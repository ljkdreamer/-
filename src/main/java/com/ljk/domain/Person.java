package com.ljk.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	
	private String name;
	private String sex;
	
	//在进行json数据输出时这个属性不展示
	//@JsonIgnore
	private Integer age;
	
	//将日期格式化输出
	//@JsonFormat(pattern="YYYY-MM-dd")
	@JsonIgnore
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
