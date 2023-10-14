package com.api.onepiece.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.onepiece.model.Fruit;
import com.api.onepiece.record.FruitDTO;
import com.api.onepiece.service.FruitService;

@RestController
@RequestMapping(path="/fruit")
public class FruitResponse {
    @Autowired
    private FruitService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<FruitDTO>> findAll() {

        List<FruitDTO> response = service.findAll().stream()
            .map(fruit -> new FruitDTO(fruit))
            .toList();

        return ResponseEntity.ok(response);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Fruit fruit) {
        service.insert(fruit);
    }
}
