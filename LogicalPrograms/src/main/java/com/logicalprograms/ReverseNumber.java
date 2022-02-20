package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number to reverse ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = 0;
		
		while(num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of Given Number is " +reverse);

		sc.close();
	}
	

}
