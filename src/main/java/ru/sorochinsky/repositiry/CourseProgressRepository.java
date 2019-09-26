package ru.sorochinsky.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Course;

/**
 * Repository class for {@link ru.sorochinsky.model.CourseProgress}
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called courseProgressRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseProgressRepository extends CrudRepository<Course, Long> {
}
