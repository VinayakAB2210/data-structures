package com.vab.datastructure.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.age < s2.age) {
			return -1;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return 0;
		}
	}

}
