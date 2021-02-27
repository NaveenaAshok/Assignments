package org.student;

import org.department.Dept;

public class Student extends Dept {
	public String studentName() {System.out.println("Name is Naveena Ashokkumar");return null;}
	public String studentDept() {System.out.println("Dept is CSE @ Sairam");return null;}
	public String studentId() {System.out.println("ID is 1234566");return null;}
	public String getStudentInfo(int id) {System.out.println("ID is 123");return null;}
	public String getStudentInfo(int id, String name) {System.out.println("ID is 123 name is ABC"+name+id);return null;}
	public String getStudentInfo(String email, String Phno) {System.out.println("mail 123ABC@gmail.com and Ph no is 098 "+ email+ Phno);return null;}
	
	
	
	public static void main(String[] args) {
		
	Student newStudent = new Student();
	newStudent.collegeCode();
	newStudent.collegeName();
	newStudent.collegeRank();
	newStudent.deptName();
	newStudent.studentDept();
	newStudent.getStudentInfo("LASd@gmail.com","123436");
	
	}

}
