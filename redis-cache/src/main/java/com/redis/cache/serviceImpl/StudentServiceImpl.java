package com.redis.cache.serviceImpl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;
import com.redis.cache.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource(name = "redisTemplate")
	private HashOperations<String, Integer, Student> opr;

	private String KEY = "STUDENT";

	@Override
	public void addStudent(Student student) {
		opr.putIfAbsent(KEY, student.getStdId(), student);
	}

	@Override
	public Map<Integer, Student> getAllStudent() {
		return opr.entries(KEY);
	}

	@Override
	public Student getOneStudent(Integer stdId) {
		return opr.get(KEY, stdId);
	}

	@Override
	public void removeStudent(Integer stdId) {
		// TODO Auto-generated method stub

	}

}
