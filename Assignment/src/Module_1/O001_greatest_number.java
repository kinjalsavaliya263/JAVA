/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program to Take three numbers from the user and print the
 * greatest number.
 */

public class O001_greatest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter the value of a :");
		a = sc.nextInt();
		System.out.print("Enter the value of b :");
		b = sc.nextInt();
		System.out.print("Enter the value of c :");
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("a is greatest");
		} else if (b > c) {
			System.out.println("b is greatest");

		} else {
			System.out.println("c is greatest");

		}
		sc.close();
	}
}
