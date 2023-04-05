
package Exception;

public class E002_Frist {
	public static void main(String[] args) {
		System.out.println("Program started ........");

		try {
			int i = 0;
			int j = 10 / 0;
			System.out.println(j);

			try {
				int a[] = new int[5];
				a[6] = 50;
				try {

				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Program ended......");
	}
}
