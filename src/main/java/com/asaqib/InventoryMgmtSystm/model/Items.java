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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemno;
	@Column
	private String name;
	private String category;
	private float cprice;
	private float sprice;
	private String quantity;
	// Date date = new Date();
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getItemno() {
		return itemno;
	}


	public void setItemno(int itemno) {
		this.itemno = itemno;
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


	public float getCprice() {
		return cprice;
	}


	public void setCprice(float cprice) {
		this.cprice = cprice;
	}


	public float getSprice() {
		return sprice;
	}


	public void setSprice(float sprice) {
		this.sprice = sprice;
	}


	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Items [itemno=" + itemno + ", name=" + name + ", category=" + category + ", cprice=" + cprice
				+ ", sprice=" + sprice + ", quantity=" + quantity+ "]";
	}

	
	
}
	
	
	
	
	
	