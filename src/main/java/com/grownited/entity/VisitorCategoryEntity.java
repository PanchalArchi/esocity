package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Visitor_category")
public class VisitorCategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visitorcategoryId;
	private String categoryName;
	public Integer getVisitorcategoryId() {
		return visitorcategoryId;
	}
	public void setVisitorcategoryId(Integer visitorcategoryId) {
		this.visitorcategoryId = visitorcategoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	

}
