package com.gradedproject.q2;

import java.util.Scanner;

public class BasePowerFind {

	int function(int x, int y) {
		if (y == 0) {
			return 1;
		} else

			return x * function(x, y - 1);

	}

	public static void main(String[] args) {
		BasePowerFind bpf = new BasePowerFind();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base number X: ");
		int x = sc.nextInt();
		System.out.print("Enter the power N = ");
		int n = sc.nextInt();
		// if user enter negative value, so we are checking n<0 or not.
		if (n < 0) {
			System.out.println("Power N must be a integer");
		} else {
			int result = bpf.function(x, n);

			System.out.println("X power N is: " + result);
		}
		sc.close();
	}

}
