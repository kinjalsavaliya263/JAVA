
package String;

import java.util.Arrays;
import java.util.Scanner;

public class S004_HW_Anagram {
	public static void main(String[] args) {
		System.out.print("Enter the String 1 : ");

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sn = s.toLowerCase();

		System.out.print("Enter the String 2 : ");
		// Scanner sc1 = new Scanner(System.in);
		String s1 = sc.nextLine();
		String sn1 = s1.toLowerCase();

		if (sn.length() == sn1.length()) {

			// String to char

			char ch[] = sn.toCharArray();
			char ch1[] = sn1.toCharArray();

			// Array sorting
			Arrays.sort(ch);
			Arrays.sort(ch1);

			boolean result = Arrays.equals(ch, ch1);
			if (result) {
				System.out.println(s + " and " + s1 + " are Anagram.........");

			} else {
				System.out.println(s + " and " + s1 + " are not Anagram.........");

			}

		} else {
			System.out.println(s + " and " + s1 + " are not Anagram.........");

		}
	}
}
