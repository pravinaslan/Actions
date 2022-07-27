package com.singleinheritance;

public class Sample {
	public static void main(String[] args) {
		
		int b[]=new int[5];
		
		b[0]=85;
		b[1]=90;
		b[2]=100;
		b[3]=54;
		
		System.out.println("for loop**************");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
		System.out.println("nested for loop*******");
		for  (int c : b) {
			System.out.println(c);
			
		}
	}
	


}
