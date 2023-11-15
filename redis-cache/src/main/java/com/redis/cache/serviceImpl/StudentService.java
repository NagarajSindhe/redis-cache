package com.redis.cache.serviceImpl;

import java.util.Map;

import com.redis.cache.entity.Student;

public interface StudentService {

	void addStudent(Student student);

	Map<Integer, Student> getAllStudent();

	Student getOneStudent(Integer stdId);

	void removeStudent(Integer stdId);

}
