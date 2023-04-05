/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a program in Java to input 5 numbers from keyboard and find their sum
 * and average using for loop.
 *
 */
public class O005_average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = 5;

		int a[] = new int[5];
		System.out.println("Enter the number :");

		// for value
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		// for + value
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i] + sum;
		}
		System.out.print("5 value sum is :");
		System.out.println(sum);

		// for Average
		int ave = sum / 5;
		System.out.println("Average is :" + ave + "%");
		sc.close();
	}
}
