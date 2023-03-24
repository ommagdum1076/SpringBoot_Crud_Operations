package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.student;
import com.example.services.StudentService;

@Service
public class StudentDao implements StudentService {
	
	@Autowired
	StudentRepo r1;
	

	@Override
	public void regdata(student s1) {
		r1.save(s1);
		
	}

}
