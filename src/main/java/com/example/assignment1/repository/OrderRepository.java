package com.example.assignment1.repository;


import com.example.assignment1.model.Order;
import com.example.assignment1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query("SELECT u FROM Order u WHERE u.nume = ?1 AND u.prenume=?1" )
    public Order findByName(String nume, String prenume);
}