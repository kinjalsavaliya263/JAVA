/*
 * Write a program to print the factorial of a number by defining a method 
	named 'Factorial'. Factorial of any number n is represented by n! and is 
	equal to 1*2*3*. *(n-1) *n. 
E.g.-	4! = 1*2*3*4 = 24
		3! = 3*2*1 = 6
		2! = 2*1 = 2
		Also, 1! = 1
		0! = 0
 */
package Module_2;

class Sample {
	public void Factorial(int f) {
		int s = 1;
		if (f == 0) {
			s = 0;
		}
		for (int i = 1; i <= f; i++) {
			s = s * i;
		}
		System.out.println("Fectorial of 4 is :" + s);
	}
}

public class O019_Factorial {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.Factorial(4);
		s1.Factorial(3);
		s1.Factorial(2);
		s1.Factorial(1);
		s1.Factorial(0);
	}
}
