package com.example.FileUserFolder.Repositories;

import com.example.FileUserFolder.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
