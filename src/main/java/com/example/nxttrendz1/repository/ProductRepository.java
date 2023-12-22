/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.Product;

import java.util.ArrayList;

public interface ProductRepository {
    ArrayList<Product> getProducts();

    Product getProductById(int productId);

    Product addProduct(Product product);

    void deleteProduct(int productId);

    Product updateProduct(int productId, Product product);

}
