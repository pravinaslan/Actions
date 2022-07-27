package com.singleinheritance;

public class Array {
	public static void main(String[] args) {
		int b[][]=new int [5][2];
		
		b[0][0]=50;
		b[0][1]=60;
		b[1][0]=70;
		b[1][1]=80;
		b[2][0]=90;
		b[2][1]=100;
		b[3][0]=110;
		b[3][1]=120;
		b[4][0]=130;
		b[4][1]=140;
		
		int length = b.length;
		System.out.println(length);
		System.out.println("nested for loop:"+"\n"+"*******");
		
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<2;j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println("for each:"+"\n"+"************");
		for(int d[]:b) {
			for (int c:d) {
				
				System.out.println(c);
			}
		}
		
	}

}
