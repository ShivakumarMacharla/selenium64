package javaBasics;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		System.out.println("reverse table");
		for(int i=10;i>=1;i--) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
