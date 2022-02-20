package com.logicalprograms;

import java.util.Scanner;

public class Stopwatch {

	public void getElapseTime() {
		int choice = 0;
		double start = 0, stop = 0;

		do {
			System.out.println("1. Start");
			System.out.println("2. Stop");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				start = System.currentTimeMillis();
				System.out.println("You have started the stopwatch please select stop now ");
				break;

			case 2:
				stop = System.currentTimeMillis();
				break;
			}
			sc.close();
		} while (choice != 2);
		double elaps = ((stop - start) / 1000) % 60;
		System.out.println("Elaps Time = " + elaps + " sec");

	}

	public static void main(String[] args) {

		System.out.println("Enter the Choice between 1 and 2");
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.getElapseTime();
	}

}
