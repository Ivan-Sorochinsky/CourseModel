package ru.sorochinsky.repositiry;

// This will be AUTO IMPLEMENTED by Spring into a Bean called professorRepository
// CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
