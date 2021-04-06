package com.example.FileUserFolder.Repositories;

import com.example.FileUserFolder.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
