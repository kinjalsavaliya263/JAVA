/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program to print the ASCII value of a given character.
 *
 */
public class O009_Ascii {
	public static void main(String[] args) {
		char a;
		System.out.print("Enter the character : ");
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		int b = a;
		System.out.println(b);
		sc.close();
	}
}
