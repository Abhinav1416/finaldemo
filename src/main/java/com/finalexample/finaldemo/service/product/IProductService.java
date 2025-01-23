package com.finalexample.finaldemo.service.product;

import com.finalexample.finaldemo.model.Product;
import com.finalexample.finaldemo.request.AddProductRequest;
import com.finalexample.finaldemo.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    // 11 methods

    Product addProduct(AddProductRequest product);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    void deleteProductById(Long id);

    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

}