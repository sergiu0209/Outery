package com.dev.Outery.repository;

import com.dev.Outery.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getUserByUsername(String username);

    User getUserByEmail(String email);
}
