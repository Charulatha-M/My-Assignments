package org.student;

import org.college.College;
import org.deparment.Department;

public class Student extends College implements Department {
public void studentName() {
	System.out.println("Student Name is Charulatha");
}
	public void studentDept() {
		System.out.println("BCA");
	}
	public void studentId() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		Student info=new Student();
		info.collegeCode();
		info.collegeName();
		info.collegeRank();
		info.studentDept();
		info.studentId();
		info.studentName();
		info.DeptId();
	}
	public void DeptId() {
		System.out.println("Dept id is 2343 ");
		
	}
}
