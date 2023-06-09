package com.kh.model;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private String gender;
	private int math;
	private int engilsh;
	
	public Student() {}
	public Student(String name, int age) {this.name = name; this.age = age;}

	public Student(String name, int age, String gender, int math, int engilsh) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.math = math;
		this.engilsh = engilsh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEngilsh() {
		return engilsh;
	}

	public void setEngilsh(int engilsh) {
		this.engilsh = engilsh;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", math=" + math + ", engilsh="
				+ engilsh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, engilsh, gender, math, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && engilsh == other.engilsh && Objects.equals(gender, other.gender)
				&& math == other.math && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.getAge());
	}
	
	
	
	
	
	
	
	
	
}
