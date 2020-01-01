package com.ljk.gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ljk.domain.Person;

public class DemoJackSon {
	
	
   

public static void main(String[] args) throws IOException {
	   Person p=new Person();
	   p.setName("李四");
	   p.setAge(12);
	   p.setDate(new Date());
	   p.setSex("男");
	   ArrayList<Person> list = new ArrayList<Person>();
	 //创建Jackson的核心对象  ObjectMapper
	  //ObjectMapper objectMapper = new ObjectMapper();
     	// String writeValueAsString = objectMapper.writeValueAsString(p);
	  //{"name":"李四","sex":"男","age":12,"date":1576587171045}
     // System.out.println(writeValueAsString);
//	  Map<String,Object> map=new HashMap<String, Object>();//map数据类型和对象一样
//	  map.put("name", "李四");
//	  map.put("age",18);
//	  map.put("sex", "男");
//	  map.put("date", new Date());
//	  System.out.println(MapToJson(map));//{"date":1576587776071,"sex":"男","name":"李四","age":18}
	   //writeValue，将数据写到d://a.txt文件中
       //mapper.writeValue(new File("d://a.txt"),p);

       //writeValue.将数据关联到Writer中
	   ObjectMapper mapper = new ObjectMapper();
	   //writeValue写入到IO文件里边
       mapper.writeValue(new FileWriter("d://b.txt"),p);
   
	   list.add(p);
	  System.out.println(ListToJson(list));//数组的形式[{"name":"李四","sex":"男","date":"2019-12-17"}]
	  
}
	
	
   //将一个类转化为Json字符串
   public String Json(Person p) throws JsonProcessingException{
	   return new ObjectMapper().writeValueAsString(p);
   }

   public static String MapToJson(Map map) throws JsonProcessingException{
	   return new ObjectMapper().writeValueAsString(map);
   }

   public static Person JsonToPerson(String p) throws IOException{
	   return new ObjectMapper().readValue(p, Person.class);
   } 
   
   
   public static String ListToJson(List<Person> map) throws JsonProcessingException{
	   return new ObjectMapper().writeValueAsString(map);
   }

}
