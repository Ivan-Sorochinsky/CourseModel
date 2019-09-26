package ru.sorochinsky.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Course;

// This will be AUTO IMPLEMENTED by Spring into a Bean called courseRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends CrudRepository<Course, Long>{
}
