package com.collectionF.Annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


interface ProductDAO {
    void addProduct(Product product);

    List<Product> getProductById(int id);

    List<Product> getAllProducts();
}


class ProductDAOImpl implements ProductDAO {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}

public class lol747 {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAOImpl();

        
        productDAO.addProduct(new Product(1, "Product A"));
        productDAO.addProduct(new Product(2, "Product B"));
        productDAO.addProduct(new Product(3, "Product C"));

        
        List<Product> product = productDAO.getProductById(2);
        if (product.isPresent()) {
            System.out.println("Product ID: " + product.get().getId() + ", Name: " + product.get().getName());
        } else {
            System.out.println("Product not found.");
        }

        
        List<Product> allProducts = productDAO.getAllProducts();
        allProducts.forEach(p -> System.out.println("Product ID: " + p.getId() + ", Name: " + p.getName()));
    }
}