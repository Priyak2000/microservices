package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "students")
	public class Student {
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String rollNumber;
	    private String course;
		public Student(Long id, String name, String rollNumber, String course) {
			super();
			this.id = id;
			this.name = name;
			this.rollNumber = rollNumber;
			this.course = course;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
	


}
