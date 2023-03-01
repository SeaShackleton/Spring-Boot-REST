package com.seashackleton.springbootrest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Green {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String state;
	
	private Integer zip;
	
	private Integer amount;
	
	private Integer qty;
	
	private String item;
	
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
	
	public String getState() {
		return state;
	}	
	
	public void setState(String state) {
		this.state = state;
	}	
	
	public Integer getZip() {
		return zip;
	}	
	
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	
	public Integer getAmount() {
		return amount;
	}	
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer getQty() {
		return qty;
	}	
	
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public String getItem() {
		return item;
	}	
	
	public void setItem(String item) {
		this.item = item;
	}	
}
