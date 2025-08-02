package codes;

import java.util.Scanner;

public class tring_objects_using_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		StringBuilder sb1 = new StringBuilder(scanner.nextLine());

		System.out.print("Enter second string: ");
		StringBuilder sb2 = new StringBuilder(scanner.nextLine());

		System.out.println("First StringBuilder: " + sb1.toString());
		System.out.println("Second StringBuilder: " + sb2.toString());

		sb2.insert(0, sb1); // Joining first to second

		System.out.println("After joining:");
		System.out.println("First StringBuilder: " + sb1.toString());
		System.out.println("Second StringBuilder: " + sb2.toString());

		scanner.close();
	}
}
