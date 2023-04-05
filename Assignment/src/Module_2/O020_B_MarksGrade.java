/*
 * Write a program which will ask the user to enter his/her marks (out of 100). Define a method 
 	that will display grades according to the marks entered as below:
 	MarksGrade
	91-100 AA
	81-90 AB
	71-80 BB
	61-70 BC
	51-60 CD
	41-50 DD
	<=40 Fail
 */

package Module_2;

class MarksGrade {
	public void Grade(int g) {
		if (g < 100) {

			if (g > 90) {
				System.out.println("Grade : AA");
			} else if (g > 80) {
				System.out.println("Grade : AB");
			} else if (g > 70) {
				System.out.println("Grade : BB");
			} else if (g > 60) {
				System.out.println("Grade : BC");
			} else if (g > 50) {
				System.out.println("Grade : CD");
			} else if (g >= 40) {
				System.out.println("Grade : DD");
			} else {
				System.out.println("Grade : Fail");
			}
		} else {
			System.out.println("Enter correct marks");
		}
	}
}

public class O020_B_MarksGrade {
	public static void main(String[] args) {
		MarksGrade m1 = new MarksGrade();
		m1.Grade(70);
	}
}
