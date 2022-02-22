package com.codeclan.example.UserFolderFile.repositories;

import com.codeclan.example.UserFolderFile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
