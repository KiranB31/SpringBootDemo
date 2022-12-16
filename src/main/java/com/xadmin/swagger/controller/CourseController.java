package com.xadmin.swagger.controller;

import com.xadmin.swagger.model.Course;
import com.xadmin.swagger.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/courseInfo")
public class CourseController {

    public final CourseService courseService;

    @PostMapping("/save")
    public String createCourse(@RequestBody Course course) {

        return this.courseService.createCourse(course);
    }

    @GetMapping("/getInfo")
    public List<Course>getAllCourses(){
        return this.courseService.getAllCourses();
    }

    @DeleteMapping("/delete/{courseId}")
    public List<Course>deleteCourseById(@PathVariable int courseId)
    {
        return this.courseService.deleteCourseById(courseId);
    }



}
