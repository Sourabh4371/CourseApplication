package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{
	

}
