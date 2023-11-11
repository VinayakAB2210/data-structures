package com.vab.datastructure.utility;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public static List<Employee> employeeList() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Vinayak", 30));
		employees.add(new Employee(2, "VB", 21));
		employees.add(new Employee(3, "Vab", 25));
		employees.add(new Employee(4, "Abhi", 32));
		employees.add(new Employee(5, "Sandy", 32));
		employees.add(new Employee(6, "Pavan", 27));
		employees.add(new Employee(7, "AD", 18));
		employees.add(new Employee(8, "DG", 27));

		return employees;
	}

	public static List<Product> productList() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Pen", 20));
		products.add(new Product(2, "Book", 50));
		products.add(new Product(3, "Pencil", 10));
		products.add(new Product(4, "Eraser", 5));
		products.add(new Product(5, "Geometry Box", 80));

		return products;
	}

}
