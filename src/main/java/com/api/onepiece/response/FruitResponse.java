package com.api.onepiece.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.onepiece.model.Fruit;
import com.api.onepiece.service.FruitService;

@RestController
@RequestMapping(path="/fruit")
public class FruitResponse {
    @Autowired
    private FruitService service;

    @GetMapping("/all")
    public List<Fruit> allFuits() {
        return service.findAll();
    }
}
