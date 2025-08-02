package codes;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (N): ");
		int N = sc.nextInt();

		double sqrt = Math.sqrt(N);
		if (sqrt == (int) sqrt) {
			System.out.println(N + " is a perfect square.");
		} else {
			System.out.println(N + " is not a perfect square.");
		}

		sc.close();
	}
}