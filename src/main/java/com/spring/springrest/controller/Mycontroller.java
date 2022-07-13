package com.spring.springrest.controller;

import com.spring.springrest.entities.Courses;
import com.spring.springrest.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private CourseServices courseService;

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));

    }
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){
        return this.courseService.addCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public Courses delCourse(@PathVariable String courseId){
        return this.courseService.delCourse(Long.parseLong(courseId));
    }
}
