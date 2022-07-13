package com.spring.springrest.services;

import com.spring.springrest.dao.CourseDao;
import com.spring.springrest.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseServices {

    @Autowired
    private CourseDao courseDao;
   // List <Courses> list;
    public CourseServiceImpl(){
    //    list = new ArrayList<>();
     //   list.add(new Courses( 1 , "Java", "java me kuchh nhi aata humko abhi sikh rhe hain"));
        //   list.add(new Courses(2," Python ", " Python me to phod denge kuchh bhi le aao"));

    }


    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }
    @Override
    public  Courses getCourse( long corseId){
//        Courses c = null;
//                for(Courses course : list){
//                    if (course.getId()==corseId){
//                        c = course;
//                        break;
//                    }
//                }
//        return c;
        return courseDao.getOne(corseId);
    }

    @Override
    public Courses addCourse(Courses course) {
        //list.add(course);
        courseDao.save(course);
        return  course;
    }

    @Override
    public Courses delCourse(long courseId) {
//        Courses c = null;
//        for(Courses course : list){
//            if (course.getId()==courseId){
//                c=course;
//                list.remove(course);
//                break;
//
//            }
//        }
        Courses entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
        return entity;
    }
}
