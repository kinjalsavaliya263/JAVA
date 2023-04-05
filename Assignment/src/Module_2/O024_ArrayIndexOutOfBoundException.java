/*
 * W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
	zero exception and another one is to handle 
	ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;

 */

package Module_2;

public class O024_ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		try {
			System.out.println("Started.....");
			int a = 10 / 0;
			System.out.println(a);
			int b[] = new int[5];
			b[5] = 30 / 0;
			System.out.println(b);

		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Ended.....");
	}
}
