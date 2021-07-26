package com.example.hello.course.controller;

public class Course {
	
	String courseName;
	String courseId;
	

	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	public Course(String courseName, String courseId) {
		this.courseName = courseName;
		this.courseId = courseId;
	}

}
