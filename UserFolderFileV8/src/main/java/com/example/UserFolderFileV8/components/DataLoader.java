package com.example.UserFolderFileV8.components;

import com.example.UserFolderFileV8.models.File;
import com.example.UserFolderFileV8.models.Folder;
import com.example.UserFolderFileV8.models.User;
import com.example.UserFolderFileV8.repositories.FileRepository;
import com.example.UserFolderFileV8.repositories.FolderRepository;
import com.example.UserFolderFileV8.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("user1");
        userRepository.save(user1);
        Folder folder1 = new Folder("folder1", user1);
        folderRepository.save(folder1);
        File file1 = new File("file1", "JPEG", 2000, folder1);
        fileRepository.save(file1);
    }

}
