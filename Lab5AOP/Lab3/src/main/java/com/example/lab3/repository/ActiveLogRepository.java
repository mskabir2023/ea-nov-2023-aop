package com.example.lab3.repository;

import com.example.lab3.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveLogRepository extends JpaRepository<Category, Integer> {
}