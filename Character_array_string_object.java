package codes;

import java.util.Scanner;

public class Character_array_string_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] charArray = { 'C', 'o', 'd', 'e', 'X' };
		String str1 = "Welcome to Java";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your message: ");
		String userInput = scanner.nextLine();

		System.out.println("Initial String: " + str1);
		System.out.println("User Input: " + userInput);

		String strFromCharArray = new String(charArray);
		System.out.println("Character Array as String: " + strFromCharArray);

		scanner.close();
	}
}
