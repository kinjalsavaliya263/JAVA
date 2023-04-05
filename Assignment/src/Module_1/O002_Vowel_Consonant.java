/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * --> Write a Java program that takes the user to provide a single character
 * from the alphabet. Print Vowel or Consonant, depending on the user input. If
 * the user input is not a letter (between a and z or A and Z), or is a string
 * of length > 1, print an error message.
 *
 */
public class O002_Vowel_Consonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Enter the value of ch :");
		a = sc.next();
		int l = a.length();
		if (l <= 1) {
			switch (a) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":

				System.out.println("Vowel");

				break;

			default:
				System.out.println("Consonant");
				break;
			}
		} else {
			System.out.println("incorrect value of ch please enter correct value");
		}
		sc.close();
	}
}
