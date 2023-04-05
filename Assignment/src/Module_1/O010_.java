/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program that accepts an integer (n) and computes the value of
 * n+nn+nnn. Input number: 5 5 + 55 + 555
 *
 */
public class O010_ {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		n = sc.nextInt();
		System.out.println(n + " + " + n + n + " + " + n + n + n);
		sc.close();
	}
}
