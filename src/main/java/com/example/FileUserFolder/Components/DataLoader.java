package com.example.FileUserFolder.Components;

import com.example.FileUserFolder.Models.File;
import com.example.FileUserFolder.Models.Folder;
import com.example.FileUserFolder.Models.User;
import com.example.FileUserFolder.Repositories.FileRepository;
import com.example.FileUserFolder.Repositories.FolderRepository;
import com.example.FileUserFolder.Repositories.UserRepository;
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

        User user1 = new User("Brian");
        userRepository.save(user1);

        User user2 = new User("Lisa");
        userRepository.save(user2);

        Folder folder1 = new Folder("morning", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("afternoon", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("homework", user1);
        folderRepository.save(folder3);

        File file1 = new File("homework", "txt", "20MB", folder3);
        fileRepository.save(file1);

        File file2 = new File("morning tasks", "txt", "15MB", folder1);
        fileRepository.save(file2);

        File file3 = new File("afternoon tasks", "txt", "30MB", folder2);
        fileRepository.save(file3);

    }
}
