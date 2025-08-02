package codes;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms (n): ");
		int n = sc.nextInt();

		int f0 = 0, f1 = 1;

		System.out.print("Fibonacci series up to " + n + " terms: ");

		for (int i = 1; i <= n; i++) {
			System.out.print(f0 + " ");
			int next = f0 + f1;
			f0 = f1;
			f1 = next;
		}

		sc.close();
	}
}