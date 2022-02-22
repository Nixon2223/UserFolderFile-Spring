package com.example.UserFolderFileV8.repositories;

import com.example.UserFolderFileV8.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
