//package com.redis.cache;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.redis.cache.entity.Student;
//import com.redis.cache.serviceImpl.StudentService;
//
//@Component
//public class RedisTest implements CommandLineRunner {
//
//	@Autowired
//	private StudentService service;
//
//	@Override
//	public void run(String... args) throws Exception {
//		service.addStudent(new Student(1, "Sam", 2.0));
//		service.addStudent(new Student(2, "Kiran", 3.0));
//		service.addStudent(new Student(3, "Rohit", 4.0));
//		service.addStudent(new Student(4, "Dilip", 5.0));
//
//		service.getAllStudent().forEach((k, v) -> System.out.println(k + " : " + v));
//	}
//
//}
