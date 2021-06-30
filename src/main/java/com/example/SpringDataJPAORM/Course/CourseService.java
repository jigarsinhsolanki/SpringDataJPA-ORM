package com.example.SpringDataJPAORM.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourse(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    public List<Course> getAllCourses(int topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);

    }

    public String deleteCourse(int id) {

        courseRepository.deleteById(id);
        return id+ " number Course is deleted successfully!!";
    }


}
