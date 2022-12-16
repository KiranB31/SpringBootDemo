package com.xadmin.swagger.service;

import com.xadmin.swagger.dao.CourseRepository;
import com.xadmin.swagger.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {


    public final CourseRepository courseRepository;

    public String createCourse(Course course)
    {
        courseRepository.save(course);
      return "saved sucessfuly with id : "+course.getCourseId();
    }

    public List<Course>getAllCourses(){
        return courseRepository.findAll();
    }

    public List<Course> deleteCourseById(int courseId){
        courseRepository.deleteById(courseId);
        return courseRepository.findAll();
    }
}
