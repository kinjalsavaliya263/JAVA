/*
 * Print the sum, difference and product of two complex numbers by 
	creating a class named 'Complex' with separate methods for each 
	operation whose real and imaginary parts are entered by user.
 */
package Module_2;

class Complex {
	int a = 2, b = 5, c, i;

	public void sum() {
		System.out.println("Sum : " + (a + b));
	}

	public void difference() {
		if (a > b) {
			c = a - b;
		} else {
			c = b - a;
		}
		System.out.println("difference : " + c);
	}

	public void complexNo() {
		int i = 3;
		c = a + (i * b);
		System.out.println("product of " + a + " + i" + b + " complex numbers is : " + c);
	}
}

public class O015_Complex_no {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.sum();
		c1.difference();
		c1.complexNo();
	}
}
