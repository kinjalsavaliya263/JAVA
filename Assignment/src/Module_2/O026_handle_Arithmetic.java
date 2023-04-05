/*
 * W.A.J. P to demonstrate try catch block, take two numbers from the user 
	by Command line argument and perform the division operation and 
	handle Arithmetic
	O/PException in thread main java. Lang. ArithmeticException:/ by zero
 */

package Module_2;

import java.util.Scanner;

public class O026_handle_Arithmetic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		int c = 0;
		try {
			c = a / b;
			System.out.println("value of c : " + c);

			sc.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("value(catch) of c : " + c);
		}

	}
}
