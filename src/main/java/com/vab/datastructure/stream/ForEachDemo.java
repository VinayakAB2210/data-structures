package com.vab.datastructure.stream;

import java.util.List;

import com.vab.datastructure.utility.Employee;
import com.vab.datastructure.utility.Util;

public class ForEachDemo {

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
		
//		Filtering list of employees to include only those whose age is > 30
//		Stream<Stud> stream = employees.stream().filter(s -> s.age >= 30);
//		stream.forEach(s -> System.out.println(s.name + " " + s.age));

//		Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
		employees.forEach(s -> System.out.println(s.name + " " + s.age));
	}

}
