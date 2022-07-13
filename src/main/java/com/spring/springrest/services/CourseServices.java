package com.spring.springrest.services;

import com.spring.springrest.entities.Courses;

import java.util.List;

public interface CourseServices {
    public List<Courses> getCourses();
    public Courses getCourse(long l);

    Courses addCourse(Courses course);

    Courses delCourse(long courseId);
}
