package ru.sorochinsky.service.impl;

import ru.sorochinsky.model.Course;
import ru.sorochinsky.model.Student;
import ru.sorochinsky.service.CourseService;

import java.util.List;

/**
 * Implementation of {@link ru.sorochinsky.service.CourseService} interface.
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

public class CourseServiceImpl implements CourseService {
    @Override
    public Course addCourse(Course course) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Course getByName(String name) {
        return null;
    }

    @Override
    public Course editCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public void addStudent(Course course, Student student) {

    }

    @Override
    public void delStudent(Course course, Student student) {

    }
}
