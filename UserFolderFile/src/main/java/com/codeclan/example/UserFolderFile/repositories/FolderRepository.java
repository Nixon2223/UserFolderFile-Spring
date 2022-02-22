package com.codeclan.example.UserFolderFile.repositories;

import com.codeclan.example.UserFolderFile.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
