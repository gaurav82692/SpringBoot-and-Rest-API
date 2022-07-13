package com.spring.springrest.dao;

import com.spring.springrest.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses,Long > {
}
