package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the num to get fibonacci series up to n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num1 = 0,num2 = 1;
		int count = 0;
		while(count< n) {
			System.out.println(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count = count + 1;
		}

	}

}
