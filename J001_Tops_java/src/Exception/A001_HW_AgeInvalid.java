
package Exception;

class Age {

	public void valid(int a) throws AgeInvalidException {
		if (a < 18) {
			throw new AgeInvalidException();
		} else {
			System.out.println("Valid Age........");

		}
	}
}

public class A001_HW_AgeInvalid {
	public static void main(String[] args) {

		Age a = new Age();
		try {
			a.valid(20);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
