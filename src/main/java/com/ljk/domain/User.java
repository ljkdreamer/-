package com.ljk.domain;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class User {
	
 /**
  * 此注解可以改变json数据输出key的值	
  */
//   @SerializedName("Name")	
   private String name;
   
   private Double age;
   
  
   private Date birthDay;
   
   private String school;
   
   private String major;
   
   /**
    * 如果不想在json数据中展示出来可以加transient注解
    */
   private transient String car;
   
   private String house;
   
   private String comment;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getAge() {
	return age;
}

public void setAge(Double age) {
	this.age = age;
}

public Date getBirthDay() {
	return birthDay;
}

public void setBirthDay(Date birthDay) {
	this.birthDay = birthDay;
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school = school;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

public String getCar() {
	return car;
}

public void setCar(String car) {
	this.car = car;
}

public String getHouse() {
	return house;
}

public void setHouse(String house) {
	this.house = house;
}

public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

public User(String name, Double age, Date birthDay, String school, String major, String car, String house,
		String comment) {
	super();
	this.name = name;
	this.age = age;
	this.birthDay = birthDay;
	this.school = school;
	this.major = major;
	this.car = car;
	this.house = house;
	this.comment = comment;
}
   
   public User() {
	// TODO Auto-generated constructor stub
}
	
	
}
