/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program to count the letters, spaces, numbers and other
 * characters of an input string.
 *
 */
public class O008_count_L_S_C_o {
	public static void main(String[] args) {
		String s;
		System.out.print("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println(s);

		int letters = 0, spaces = 0, numbers = 0, other = 0;
		char ch[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letters++;
			} else if (Character.isDigit(ch[i])) {
				numbers++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			} else {
				other++;
			}
		}
		System.out.println("letter: " + letters);
		System.out.println("space: " + spaces);
		System.out.println("number: " + numbers);
		System.out.println("other: " + other);
		sc.close();
	}
}
