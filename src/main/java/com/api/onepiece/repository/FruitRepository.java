package com.api.onepiece.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.onepiece.model.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    
}
