package com.example.SpringDataJPAORM.Course;

import com.example.SpringDataJPAORM.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/topics/{topicId}/courses")
    public Course addCourse(@RequestBody Course course,@PathVariable int topicId){
        course.setTopic(new Topic(topicId, "",""));
        return courseService.addCourse(course);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }


    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable int id){
        return courseService.getAllCourses(id);
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course, @PathVariable int topicId){
        course.setTopic(new Topic(topicId, "",""));
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public String deleteCourse(@PathVariable int id){

        return courseService.deleteCourse(id);
    }

}
