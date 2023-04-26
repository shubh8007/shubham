package com.product;

import java.util.Scanner;

public class CategoryTester {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

Category[] catg=Category.values();
System.out.println(catg);

for(Category c:catg) {
	System.out.println(c);
}
System.out.println("enter your Choice..");
 Category c=Category.valueOf(sc.next().toUpperCase());
 System.out.println(c);
 Product[] pr=new Product[10];
 
 for(int i=0;i<pr.length;i++) {
	 System.out.println("Enter the product Details....");
	 Product p=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),Category.valueOf(sc.next().toUpperCase()));
	 System.out.println(p.toString());
	 
 }
 
 
 
	}

}
