package com.api.onepiece.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.onepiece.model.Fruit;
import com.api.onepiece.repository.FruitRepository;
import com.api.onepiece.service.FruitService;

@Service
public class FruitServiceImpl implements FruitService {
    
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public void insert(Fruit fruit) {
        fruitRepository.save(fruit);
    }

}
