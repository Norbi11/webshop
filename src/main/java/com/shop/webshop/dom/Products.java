package com.shop.webshop.dom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid", nullable = false)
	private int pid;
	@Column(name="pname", nullable = false)
	private String pname;
	@Column(name="pprice", nullable = false)
	private double pprice;
	@Column(name="pweight", nullable = false)
	private int pweight;
	@Column(name="pdescription")
	private String pdescription;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPweight() {
		return pweight;
	}
	public void setPweight(int pweight) {
		this.pweight = pweight;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

}
