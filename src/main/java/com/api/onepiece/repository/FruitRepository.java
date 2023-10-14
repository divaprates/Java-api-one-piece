package com.api.onepiece.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.onepiece.model.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    
}
