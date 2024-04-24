package com.example.SpringPostgresDocker.respository;

import com.example.SpringPostgresDocker.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepo extends JpaRepository<Students, Integer> {

}
