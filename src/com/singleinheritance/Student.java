package com.singleinheritance;

public class Student {
	public static void main(String[] args) {
		
		//to create object for array
		int a[]=new int [6];
		
		//to insert values in array
		a[0]=10;
		a[1]=45;
		a[2]=50;
		a[3]=60;
		a[4]=70;
		a[5]=80;
		
	// length
		int length = a.length;
		System.out.println(length);
		
		// to print value in array
		System.out.println(a[0]);
		System.out.println("for loop"+"***********");
		// to print all values in array
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
			
			}
		System.out.println("enhanced for loop:"+"\n"+"*******");
		for(int b:a) {
			System.out.println(b);
		}
			
		}
	
		
		
		
		
		
	}

	

	
		
		
	
		
	
	


