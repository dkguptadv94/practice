package com.dk.it.comoaratorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class Student{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}
public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Student> al=new  ArrayList<Student>();
		al.add(new Student(101, "Nilesh",26));
		al.add(new Student(102, "Raja", 27));
		al.add(new Student(103, "Suresh",21));
		al.add(new Student(104, "DK", 27));
		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComparator());
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		System.out.println("sorting by Age....");
		Collections.sort(al,new AgeComparator());
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
