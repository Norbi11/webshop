package com.shop.webshop.dom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCK")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid", nullable = false)
	private int sid;
	@Column(name="pid", nullable = false)
	private int pid;
	@Column(name="pamount", nullable = false)
	private int pamount;
	@Column(name="pshippingprice", nullable = false)
	private double pshippingprice;
	@Column(name="pshippingtime", nullable = false)
	private int pshippingtime;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPamount() {
		return pamount;
	}
	public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	public double getPshippingprice() {
		return pshippingprice;
	}
	public void setPshippingprice(double pshippingprice) {
		this.pshippingprice = pshippingprice;
	}
	public int getPshippingtime() {
		return pshippingtime;
	}
	public void setPshippingtime(int pshippingtime) {
		this.pshippingtime = pshippingtime;
	}

}
