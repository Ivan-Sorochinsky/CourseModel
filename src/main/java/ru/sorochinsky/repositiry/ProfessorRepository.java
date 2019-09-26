package ru.sorochinsky.repositiry;

/**
 * Repository class for {@link ru.sorochinsky.model.Professor}
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called professorRepository
// CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.CrudRepository;
import ru.sorochinsky.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
