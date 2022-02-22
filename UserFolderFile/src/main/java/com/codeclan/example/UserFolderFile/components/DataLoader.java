package com.codeclan.example.UserFolderFile.components;

import com.codeclan.example.UserFolderFile.models.File;
import com.codeclan.example.UserFolderFile.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        File file1 = new File("file1", "JPEG", 2000);
        fileRepository.save(file1);
    }

}
