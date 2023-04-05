/*
 * W.A.J.P to create the validate method that takes integer value as a 
	parameter. If the age is less than 18, then throw an ArithmeticException 
	otherwise print a message welcome to vote.
	O/P- Enter your age: 16
	Exception in thread main java. lang. ArithmeticException: not valid
 */

package Module_2;

class Age {

	public void valid(int a) throws ArithmeticException {
		if (a < 18) {
			throw new ArithmeticException();
		} else {
			System.out.println("Valid Age........");

		}
	}
}

public class O028_Age_ArithmeticException {
	public static void main(String[] args) {

		Age a = new Age();
		try {
			a.valid(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
