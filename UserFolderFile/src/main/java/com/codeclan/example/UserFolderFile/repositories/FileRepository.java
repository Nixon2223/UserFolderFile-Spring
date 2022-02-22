package com.codeclan.example.UserFolderFile.repositories;

import com.codeclan.example.UserFolderFile.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
