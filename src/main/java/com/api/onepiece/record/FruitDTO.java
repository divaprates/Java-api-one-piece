package com.api.onepiece.record;

import com.api.onepiece.model.Fruit;

public record FruitDTO(
        Integer id,
        String name,
        String type,
        String description,
        String filename) {

    public FruitDTO(Fruit entity) {
        this(entity.getId(), entity.getName(), entity.getType(), entity.getDescription(), entity.getFilename());
    }

}
