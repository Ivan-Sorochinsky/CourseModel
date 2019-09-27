package ru.sorochinsky.service.impl;

import ru.sorochinsky.model.CourseProgress;
import ru.sorochinsky.service.CourseProgressService;

import java.util.List;

/**
 * Implementation of {@link ru.sorochinsky.service.CourseProgressService} interface.
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

public class CourceProgressServiceImpl implements CourseProgressService {
    @Override
    public CourseProgress addCourseProgress(CourseProgress courseProgress) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public CourseProgress getByName(String name) {
        return null;
    }

    @Override
    public CourseProgress editCourseProgress(CourseProgress courseProgress) {
        return null;
    }

    @Override
    public List<CourseProgress> getAll() {
        return null;
    }

    @Override
    public void avgPoint(List<Integer> points) {

    }

    @Override
    public void finalPoint(Integer finalPoint) {

    }
}
