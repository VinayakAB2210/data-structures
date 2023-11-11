package com.vab.datastructure.comparator;

public class Student implements Comparable<Student> {

	String name;
	Integer rollno;
	Integer age;

	public Student(String name, Integer rollno, Integer age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student stud) {
		return (name.compareTo(stud.getName()) > 0) ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}

}
