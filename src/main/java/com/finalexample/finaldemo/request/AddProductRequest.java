package com.finalexample.finaldemo.request;

import com.finalexample.finaldemo.model.Category;
import lombok.Data;

import java.math.BigDecimal;

// This is created because we don't want to interact directly with the model(which is our database)

@Data
public class AddProductRequest {
    private Long id;
    private String brand;
    private String name;
    private String description;
    private BigDecimal price;
    private int inventory;
    private Category category;

}
