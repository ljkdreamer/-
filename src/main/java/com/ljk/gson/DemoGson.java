package com.ljk.gson;

import java.lang.reflect.Field;
import java.util.Date;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ljk.domain.User;

/**
 * gson的入门
 * 两个方法
 * 1.toJson
 * 2.fromJson
 * @author Administrator
 *
 */
public class DemoGson {
	
	public static void main(String[] args) {
		User user=new User();
		user.setName("小明");
		user.setAge(25.1);
		user.setBirthDay(new Date());
		user.setCar("蘭博基尼");
		user.setMajor("學生");
		user.setSchool("平院");
		user.setComment("這是一個注釋");
        String jsonByBuilder = getJSONByBuilder(user);
		System.out.println(jsonByBuilder);
	}
	
	/**
	 * 直接通过gson.toJson进行数据解析
	 * @param user
	 * @return
	 */
	public  static String getJSON(User user){
		  Gson gson=new Gson();
	        String json = gson.toJson(user);
	        return json; 
	}
	
	public  static String getJSONByBuilder(User user){
		  GsonBuilder builder=new GsonBuilder();
		  builder.setPrettyPrinting();//对json数据进行格式化输出
		  /**
		   *得到一个属性然后让这个属性的在展示的时候改变它的key值
		   *它和@SerializedName("Name")这个注解不能同时存在
		   */
		  builder.setFieldNamingStrategy(new FieldNamingStrategy() {
			public String translateName(Field f) {
				if(f.getName().equals("name")){
					return "NAME";
				}
				return f.getName();
			}
		}) ;
		  Gson gson=builder.create();
	        String json = gson.toJson(user);
	        return json; 
	}
	 

}
