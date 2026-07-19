package javaBasics;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		System.out.println("============for loop===============");
//		for(int i=1;i<=num;i++) {
//			System.out.println(i);
//		}
//		
//		int i=1;
//		System.out.println("============ while===============");
//		while(i<=num) {
//			System.out.println(i);
//			i++;
//		}
//		int j=1;
//		System.out.println("============Do while===============");
//		do {
//			System.out.println(j);
//			j++;
//		}
//		while(j<=num);
//		
//		System.out.println("============REVERSE NUMBERS for===============");
//		
//		for(int i1=num;i1>0;i1--) {
//			System.out.println(i1);
//		}
//		
//		System.out.println("============REVERSE NUMBERS while===============");
//		int j1=1;
//		while(num>0) {
//			System.out.println(num);
//		num--;
//			
//		}
		System.out.println("============REVERSE NUMBERS do while===============");
		
		
		do {
			System.out.println(num);
			num--;
		}
		while(num>0);
		
		 
	}

}
