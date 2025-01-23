package com.finalexample.finaldemo.request;

import com.finalexample.finaldemo.model.Category;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductUpdateRequest {
    private Long id;
    private String brand;
    private String name;
    private String description;
    private BigDecimal price;
    private int inventory;
    private Category category;

}
