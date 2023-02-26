package Tandon.Management.service;


import Tandon.Management.model.Course;
import Tandon.Management.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepository courseRepository;


    public Course addCourse(Course newCourse) {
        return courseRepository.save(newCourse);
    }


    public Course getCourseById(int id) {
        return courseRepository.findById(id).get();
    }

    //get all
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    //delete
    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }

    //update
    public void updateCourseById(int id, Course newCourse) {
        Course course = courseRepository.findById(id).get();

        course.setCourseId(newCourse.getCourseId());
        course.setDescription(newCourse.getDescription());
        course.setDuration(newCourse.getDuration());
        course.setTitle(newCourse.getTitle());
        course.setStudentList(newCourse.getStudentList());

        courseRepository.save(course);
    }


}