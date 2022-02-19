package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	//function that checks if the given number is perfect or not  
	public static int isPerfect(int num) {
		int sum = 0;
		
		//executes until the condition becomes false  
		for(int i = 1; i<=num/2; i++) {
			if(num % i == 0) {
				//calculates the sum of factors  
				sum = sum + i;
			}
		}
		return sum;
	}//end of method
	
	public static void main(String[] args) {
		int number , s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		//reads a number from the user  
		number = sc.nextInt();
		
		//calling the function 
		s=isPerfect(number);
		
		//compares sum with the number 
		if(s== number) {
			System.out.println("Is perfect number " +number);
		}
		else {
			System.out.println(" Not perfect number " );
		}
		sc.close();
	}


}
