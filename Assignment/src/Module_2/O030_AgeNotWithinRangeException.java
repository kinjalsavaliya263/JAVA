/*
 * W.A.J.P to create a class Student with attributes roll no, name, age and 
	course. Initialize values through parameterized constructor. If age of 
	student is not in between 15 and 21 then generate user defined exception 
	"AgeNotWithinRangeException". If name contains numbers or special 
	symbols raise exception "NameNotValidException". Define the two 
	exception classes.
 */

package Module_2;

class Student {
	int Roll_No = 1;
	String Name = "ki#jal";
	int age = 16;
	String Course = "java";

	public void display() throws NameNotValidException, AgeNotWithinRangeException {
		System.out.println("Started.......");
		char a[] = Name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '@' || a[i] == '#' || a[i] == '$' || a[i] == '%' || a[i] == '^' || a[i] == '&') {
				throw new NameNotValidException();

			} else {
				System.out.println(a[i]);
			}

		}
		if (age > 15 && age < 21) {
			throw new AgeNotWithinRangeException();
		} else {
			System.out.println("age.......");
		}

	}
}

public class O030_AgeNotWithinRangeException {
	public static void main(String[] args) {
		Student s1 = new Student();
		try {
			s1.display();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
