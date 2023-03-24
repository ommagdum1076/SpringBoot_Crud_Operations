package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.student;

@Repository
public interface StudentRepo extends JpaRepository<student, Integer> {

}
