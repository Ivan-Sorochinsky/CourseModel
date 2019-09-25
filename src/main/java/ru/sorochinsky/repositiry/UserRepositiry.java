package ru.sorochinsky.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorochinsky.model.User;

public interface UserRepositiry extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
