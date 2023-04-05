/*
 * 	W.A.J.P to compare a given string to the specified character sequence.
	Comparing topsint.com and topsint.com: true Comparing Topsint.com 
	and topsint.com: false
 */
package Module_2;

import java.util.Scanner;

public class O003_Comepare_String {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string s1 :");
		s1 = sc.nextLine();
		System.out.println("Enter string s2 :");
		s2 = sc.nextLine();

		System.out.println(s1.equals(s2));
		sc.close();
	}
}
