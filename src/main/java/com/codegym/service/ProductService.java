package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Product1", "1", "des1","manu1"));
        products.put(2, new Product(2, "Product2", "2", "des2","manu2"));
        products.put(3, new Product(3, "Product3", "3", "des3","manu3"));
        products.put(4, new Product(4, "Product4", "4", "des4","manu4"));
        products.put(5, new Product(5, "Product5", "5", "des5","manu5"));
        products.put(6, new Product(6, "Product6", "6", "des6","manu6"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
