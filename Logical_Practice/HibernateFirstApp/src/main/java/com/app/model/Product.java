package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProdTab")
public class Product {
	@Id
	@Column(name = "PID")
	private int pid;
	@Column(name = "PName")
	private String pName;
	@Column(name = "Price")
	private double pPrice;
	@Column(name = "Quantity")
	private long pQuantity;

	public Product() {
		super();
	}

	public Product(int pid, String pName, double pPrice, long pQuantity) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public long getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(long pQuantity) {
		this.pQuantity = pQuantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity + "]";
	}

}
