package com.example.assignment1.repository;

import com.example.assignment1.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository  extends JpaRepository<Show,Long> {
}
