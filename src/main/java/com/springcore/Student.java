package com.springcore;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentCourse;
	private String mobileNumber;
	private String studentRoll;
	
	//getter and setter
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		System.out.println("ingetstudent method");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse=studentCourse;
	}
	public String getmobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public String getstudentRoll() {
		return studentRoll;
	}
	
	public void setstudentRoll(String studentRoll) {
		this.studentRoll=studentRoll;
	}
	//parameterized constructor
	public Student(int studentId, String studentName, String studentAddress, String studentCourse,String mobileNumber, String studentRoll) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentCourse=studentCourse;
		this.mobileNumber=mobileNumber;
		this.studentRoll=studentRoll;
		
	}
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
//				+ "]";
//	}  
	@Override
	public String toString() {
		return "Student(studentId= " + studentId + ",studentName= " + studentName + ",studentAddress= " + studentAddress + ",studentCourse= " + studentCourse +",mobileNumber= "+ mobileNumber + ",studentRoll=" + studentRoll + ")";
	}
	
	
}
