package com.asaqib.InventoryMgmtSystm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_no;
	@Column
	private String name;
	private String category;
	private float cost_price;
	private float selling_price;
	private int quantity;
	// Date date = new Date();
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost_price() {
		return cost_price;
	}

	public void setCost_price(float cost_price) {
		this.cost_price = cost_price;
	}

	public float getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(float selling_price) {
		this.selling_price = selling_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Items [s_no=" + s_no + ", name=" + name + ", category=" + category + ", cost_price=" + cost_price
				+ ", selling_price=" + selling_price + ", quantity=" + quantity + "]";
	}
	
}
	
	
	
	
	
	