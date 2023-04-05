/**
 * 
 */
package Module_2;

import java.util.Scanner;

/**
 * W.A.J.P to get the character at the given index within the String. Original
 * String = Tops Technologies! The character at position 0 is T, The character
 * at position 10 is o
 *
 */
public class O0001_Character_index {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println("Enter the character no : ");
		n = sc.nextInt();
//		System.out.println(s);
		System.out.println("The character at position " + n + " is " + s.charAt(n));
		sc.close();
	}
}
