package ru.sorochinsky.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Student;

/**
 * Repository class for {@link ru.sorochinsky.model.Student}
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called studentRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Long> {
}