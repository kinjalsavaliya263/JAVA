/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program that takes a year from user and print whether that year
 * is a leap year or not.
 *
 */
public class O003_leap_year {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int y;
		System.out.println("Enter year :");
		y = sc.nextInt();
		if (y % 4 == 0 || y % 400 == 0) {
			System.out.println("Leap year");

		} else if (y % 100 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not Leap year");
		}
		sc.close();
	}
}
