package com.product;

public class Product {
private int pid;
private String name;
private double price;
private Category category;

public Product(int pid,String name,double price,Category category) {
	this.pid=pid;
	this.name=name;
	this.price=price;
	this.category=category;
}
public String toString() {
	return "Pid="+pid+" name="+name+" price="+price+" category="+category;
	
}
}
