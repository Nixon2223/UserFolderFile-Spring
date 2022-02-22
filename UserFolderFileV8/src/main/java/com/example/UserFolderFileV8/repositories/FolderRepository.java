package com.example.UserFolderFileV8.repositories;

import com.example.UserFolderFileV8.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
