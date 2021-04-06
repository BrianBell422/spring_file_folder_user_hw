package com.example.FileUserFolder.Repositories;

import com.example.FileUserFolder.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
