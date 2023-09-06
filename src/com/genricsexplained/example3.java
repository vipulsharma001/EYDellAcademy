package com.genricsexplained;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class Product {

	private int id;
	private String name;
	private int quantity;

	public Product(int id, String name, int quantity) {

		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

interface ProductDAO {
	public List<Product> getAllProducts();

	public Product getProduct(int ProductId);

	public void updateProduct(Product p);

	public void deleteProduct(Product p);
}

class ProductDAOImpl implements ProductDAO {
	List<Product> products;
	{
		products = new ArrayList<>();
		Product p1 = new Product(1, "ABC", 20);
		Product p2 = new Product(2, "BCD", 21);
		Product p3 = new Product(3, "CDE", 22);
		products.add(p1);
		products.add(p2);
		products.add(p3);
	}

	public List<Product> getAllProducts() {
		return products;
	}

	public Product getProduct(int ProductId) {
		return products.get(ProductId);
	}

	public void updateProduct(Product p2) {
		Iterator<Product> itr = getAllProducts().iterator();
		while (itr.hasNext()) {
			Product px = itr.next();
			px.setId(p2.getId());

		}
	}

	public void deleteProduct(Product p) {
		products.remove(p);
	}

}

public class example3 {
	public static void main(String[] args) {
		ProductDAO obj = new ProductDAOImpl();
		Product p3 = new Product(1, "A", 3);
		for (Product p : obj.getAllProducts()) {
			System.out.println("Name:" + p.getName() + "\nId:" + p.getId() + "\nQuantity:" + p.getQuantity());
		}
	}
}