/**
 * 
 */
package Module_1;

/**
 * Write a program in Java to display the pattern like right angle triangle with
 * a number. 1 12 123 1234 12345
 *
 */
public class O005_pattern_1 {
	public static void main(String[] args) {

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
