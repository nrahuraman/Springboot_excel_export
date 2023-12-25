package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course {

	@Id
	private Integer id;
	private String name;
	private Double price;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
