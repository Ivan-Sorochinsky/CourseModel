package ru.sorochinsky.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Student;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Long> {

}