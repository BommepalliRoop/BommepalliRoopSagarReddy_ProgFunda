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
		int x = 0;
		int y = 0;
		int r = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

		r = bpf.function(x, y);
		System.out.println(r);
		sc.close();
	}

}
