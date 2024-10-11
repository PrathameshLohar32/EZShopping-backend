package com.shoppingCart.Ecommerce.service.product;

import com.shoppingCart.Ecommerce.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);

}
