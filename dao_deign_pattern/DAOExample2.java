package com.dao_deign_pattern;

import java.util.ArrayList;
import java.util.List;

class Product {
	private int pid;

	private String pname;

	public Product(int pid, String pname) {

		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}

	
}

interface ProductDao {
	Product get(int pid);

	List<Product> getAll();

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
}

class ProductDaoImp implements ProductDao {
	static List<Product> products =new ArrayList<>();
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product get(int pid) {
		// TODO Auto-generated method stub

		return products.get(pid);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
	}

	@Override
	public void update(Product product) {
		products.get(1).setPname(product.getPname());
		System.out.println("Product with id " + product.getPid() + " is updated");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		products.remove(product.getPid());
		System.out.println("Student with id " + product.getPid() + " is removed");
	}
}

public class DAOExample2 {
	public static void main(String[] args) {
		ProductDao productDAO = new ProductDaoImp();
		for (Product pd : productDAO.getAll()) {
			pd.toString();
		}
		productDAO.insert(new Product(1, "Product A"));
        productDAO.insert(new Product(2, "Product B"));
        productDAO.insert(new Product(3, "Product C"));

		for (Product pd : productDAO.getAll()) {
			System.out.println("Product [ product id " + pd.getPid() + " , Name: " + pd.getPname() + " ] ");
		}
		
		productDAO.update(new Product(2, "Product Update"));
		System.out.println("After Update:");
		for (Product pd : productDAO.getAll()) {
			System.out.println(" Product [ product id " + pd.getPid() + " , Name: " + pd.getPname() + " ] ");
		}
		
		productDAO.delete(new Product(2, "Product Update"));
		System.out.println("After Deletion:");
		for (Product pd : productDAO.getAll()) {
			System.out.println(" Product [ product id " + pd.getPid() + " , Name: " + pd.getPname() + " ] ");
		}
	}
}