/*
 * Take two numbers from the user and perform the division operation and 
	handle Arithmetic Exception. O/PEnter two numbers: 10 0
	Exception in thread main java.lang.ArithmeticException:/ by zero
 */

package Module_2;

public class O023_ArithmeticException {
	public static void main(String[] args) {
		try {
			System.out.println("Pro... Started...");
//			int a = 0;
			int b = 10 / 0;
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
