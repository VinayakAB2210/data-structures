package com.vab.datastructure.stream;

import java.util.List;
import java.util.stream.Stream;

import com.vab.datastructure.utility.Employee;
import com.vab.datastructure.utility.Util;

public class StreamFilterDemo {

	public static void main(String[] args) {
		List<Employee> employees = Util.employeeList();

		// 1, "Vinayak", 30
		// 2, "VB", 21
		// 3, "Vab", 25
		// 4, "Abhi", 32
		// 5, "Sandy", 32
		// 6, "Pavan", 27
		// 7, "AD", 18
		// 8, "DG", 27

		System.out.println("-------------- Output - 1 --------------");
		Stream<Employee> stream = employees
				.stream()
				.filter(s -> s.age > 25);
		stream.forEach(s -> System.out.println(s.name + " " + s.age));
		
		System.out.println("-------------- Output - 2 --------------");
		employees.stream()
		.filter(s -> s.eid < 5)
		.forEach(s -> System.out.println(s.name + " " + s.age));

	}

}
