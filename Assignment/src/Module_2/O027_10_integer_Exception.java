/*
 * W.A.J.P to read 10 integer values using Scanner class from keyboard. 
	Generate the exception if the entered value is less than 10 and or greater 
	than 40. Program should display appropriate message as and when this 
	exception occurs otherwise it will display all the entered values.
 */

package Module_2;

import java.util.Scanner;

class integer {
	public void values(int a[]) throws ArithmeticException {
		for (int i = 0; i < 10; i++) {
			if (a[i] > 10 && a[i] < 40) {

				System.out.println(a[i]);
			} else {
				throw new ArithmeticException();
			}
		}
	}
}

public class O027_10_integer_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 10;
		int a[] = new int[l];
		System.out.println("Enter the elements of the array :");
		for (int i = 0; i < l; i++) {
			a[i] = sc.nextInt();
		}
		integer i = new integer();
		try {
			i.values(a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();
	}
}
