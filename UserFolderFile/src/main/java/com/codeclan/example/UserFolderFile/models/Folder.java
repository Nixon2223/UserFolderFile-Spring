package com.codeclan.example.UserFolderFile.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String title;
    private List<File> files;

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
