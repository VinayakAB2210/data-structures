package com.vab.datastructure.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemoLambdaExp {

	public static void main(String args[]) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Vinayak", 1, 28));
		students.add(new Student("ABC", 2, 21));
		students.add(new Student("DEF", 3, 29));

		Collections.sort(students, (s1, s2) -> {
			return s1.getRollno() > s2.getRollno() ? 1 : -1;
		});

		for (Student st : students) {
			System.out.println(st.toString());
		}
	}

}
