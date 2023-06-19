package com.eloge.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloge.library.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
