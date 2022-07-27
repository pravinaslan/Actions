package com.singleinheritance;

public class Array2 {
	public static void main(String[] args) {
		
		int a[][]=new int[4][5];
		a[0][0]=5;
		a[0][1]=10;
		a[0][2]=15;
		a[0][3]=20;
		a[0][4]=25;
		a[1][0]=30;
		a[1][1]=35;
		a[1][2]=40;
		a[1][3]=45;
		a[1][4]=50;
		a[2][0]=55;
		a[2][1]=60;
		a[2][2]=65;
		a[2][3]=70;
		a[2][4]=75;
		a[3][0]=80;
		a[3][1]=90;
		a[3][2]=100;
		a[3][3]=110;
		a[3][4]=120;
		
		int length = a.length;
		System.out.println(length);
		
		//nested  for loop
		System.out.println("nested for loop:"+"\n"+"*******");
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(a[i][j]);
			}
		}
		//for each 
		for(int b[]:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}
	}

}
