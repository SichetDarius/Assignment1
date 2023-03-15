package com.example.assignment1.repository;

import com.example.assignment1.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Show,Long> {
}
