package ru.sorochinsky.service.impl;

import ru.sorochinsky.model.Course;
import ru.sorochinsky.model.CourseProgress;
import ru.sorochinsky.model.Student;
import ru.sorochinsky.service.StudentService;

import java.util.List;

/**
 * Implementation of {@link ru.sorochinsky.service.StudentService} interface.
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

public class StudentServiceImpl implements StudentService {
    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Student getByName(String name) {
        return null;
    }

    @Override
    public Student editStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void addStudentInCourse(Course course, Student student) {

    }

    @Override
    public void listEndCourse(List<CourseProgress> completed) {

    }
}
