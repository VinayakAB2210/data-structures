package com.vab.datastructure.stream;

import java.util.List;
import java.util.stream.Stream;

import com.vab.datastructure.utility.Employee;
import com.vab.datastructure.utility.Util;

public class StreamFilterWithMapDemo {

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

		Stream<String> stream = employees
				.stream()
				.filter(s -> s.name.startsWith("V"))
				.map(s -> s.eid + "-" + s.name + "-" + s.age);

		stream.forEach(s -> System.out.println(s));
	}

}
