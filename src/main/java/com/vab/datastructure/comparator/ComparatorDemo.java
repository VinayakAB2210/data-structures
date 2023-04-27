package com.vab.datastructure.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String args[]) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Vinayak", 1, 28));
		students.add(new Student("ABC", 2, 21));
		students.add(new Student("DEF", 3, 29));

		// Sorts based on name as Student overrides comparable method - compareTo(o2)
		// Collections.sort(students);

		// Uses AgeComparator class that overrides comparator method - compare(o1, o2)
		// Collections.sort(students, new AgeComparator());

		// Uses comparing static method to sort by rollno
		Collections.sort(students, Comparator.comparing(Student::getRollno));

		for (Student st : students) {
			System.out.println(st.toString());
		}
	}

}
