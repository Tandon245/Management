package Tandon.Management.controller;


import Tandon.Management.model.Course;
import Tandon.Management.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/course/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public Course addBook(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/updateCourse/{id}")
    public void updateCourse(@PathVariable int id, @RequestBody Course newCourse) {
        courseService.updateCourseById(id, newCourse);
    }

    @DeleteMapping("deleteCourse/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourseById(id);
    }

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourse();
    }


}