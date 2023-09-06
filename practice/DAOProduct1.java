package com.practice;

import java.lang.invoke.CallSite;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;

	public Product(int product_id, String prod_name, String prod_desc, int prod_quantity, double prod_price,
			LocalDate prodValidity) {

		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prodValidity = prodValidity;
	}

	Product() {
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}

	public LocalDate getProdValidity() {
		return prodValidity;
	}

	public void setProdValidity(LocalDate prodValidity) {
		this.prodValidity = prodValidity;
	}
}

interface ProductDAO {
	String nameOfProduct(Product p);

	int priceOfProduct(Product p);

	int quantityOfProduct(Product p);

	String descriptionOfProduct(Product p);

	LocalDate prodValidityDate(Product p);

	public List<Product> getAll();

	List<Product> getAllProducts();

	void updateProduct(Product p);
	void updateProductAtIndex(Product p,int i);
	void deleteProduct(Product p);
}

class ProductDAOImpl implements ProductDAO {
	List<Product> listOfProducts = new ArrayList<>();

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return listOfProducts;
	}

	public ProductDAOImpl() {
		Product p1 = new Product(123, "A", "B", 10, 10.29, LocalDate.now());
		Product p2 = new Product(124, "C", "D", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		Product p3 = new Product(125, "C", "D", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
	}

	@Override
	public String nameOfProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_name();
		}
		return null;
	}

	@Override

	public int priceOfProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			return (int) p2.getProd_price();
		}
		return 0;

	}

	@Override

	public int quantityOfProduct(Product p) {

		return 0;

	}

	@Override

	public String descriptionOfProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_desc();
		}
		return null;
	}

	@Override
	public LocalDate prodValidityDate(Product p) {
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	public void updateProduct(Product p) {
		Iterator<Product> itr = getAllProducts().iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			p2.setProd_name(p.getProd_name());

		}
	}
//	public void updateProductAtIndex(Product p,int i) {
//		int j=1;
//		Iterator<Product> itr = getAllProducts().iterator();
//		while (itr.hasNext()) {
//			
//			Product p2 = itr.next();
//			if(j==i)
//			{
//			p2.setProd_name(p.getProd_name());
//			j++;
//			}
//		}
//	}
	@Override
	public void deleteProduct(Product p) {
		listOfProducts.remove(p);
//		 Iterator<Product> iterator = listOfProducts.iterator();
//	        while (iterator.hasNext()) {
//	            Product product = iterator.next();
//	            if (product.getProduct_id() == p.getProduct_id()) {
//	                iterator.remove();
//	                
//	            }
//	        }
//	        for (Product product : listOfProducts) {
//	            System.out.println(product);
//	        }
//	       

	}

	@Override
	public void updateProductAtIndex(Product p, int i) {
		// TODO Auto-generated method stub
		
	}
}

public class DAOProduct1 {
	public static void main(String[] args) {
		
		ProductDAOImpl obj = new ProductDAOImpl();
		Product p3 = new Product(126, "X", "Y", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		obj.updateProduct(p3);
		for (Product p : obj.getAllProducts()) {
//			obj.updateProductAtIndex(p3,2);
//			obj.updateProduct(p3);
			System.out.println("Product Id " + p.product_id + " Product_name is " + p.prod_name);
//			obj.deleteProduct(p);


		}
//		afterDelete();

	}

	static void afterDelete() {
		ProductDAOImpl obj = new ProductDAOImpl();
		if (null != obj.getAllProducts()) {
			for (Product p : obj.getAllProducts()) {
				System.out.println("After Deletion: \nProduct Id " + p.product_id + " Product_name is " + p.prod_name);
			}
		} else {
			System.out.println("List if Empty");
		}
	}
}
