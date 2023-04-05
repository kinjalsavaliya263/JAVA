/*
 * 	Create a class named 'PrintNumber' to print various numbers of different 
	data types by creating different methods with the same name 'printn' 
	having a parameter for each data type.

 */

package Module_2;

class PrintName {
	public void printn(int a) {
		System.out.println(a);
	}

	public void printn(int a, int b) {
		System.out.println(a + " and " + b);
	}

	public void printn() {
		System.out.println("Hallo....");
	}
}

public class O008_Mathods {
	public static void main(String[] args) {
		PrintName p1 = new PrintName();
		p1.printn();
		p1.printn(10);
		p1.printn(20, 30);
	}
}
