package com.vab.datastructure.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.vab.datastructure.utility.Employee;
import com.vab.datastructure.utility.Util;

public class StreamFilterWithMapCollectDemo {

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

		List<Integer> eids = employees.stream()
		.map(s -> s.eid)
		.filter(s -> s > 3)
		.collect(Collectors.toList());
		
		for(Integer s : eids) {
			System.out.println(s);
		}
	}
}
