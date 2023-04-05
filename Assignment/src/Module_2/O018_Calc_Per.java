/*
 *We have to calculate the percentage of marks obtained in three subjects 
	(each out of 100) by student A and in four subjects (each out of 100) by 
	student B. Create an abstract class 'Marks' with an abstract method 
	'getPercentage'. It is inherited by two other classes 'A' and 'B' each having 
	a method with the same name which returns the percentage of the 
	students. The constructor of student A takes the marks in three subjects 
	as its parameters and the marks in four subjects as its parameters for 
	student B. Create an object for each of the two classes and print the 
	percentage of marks for both the students.
 
 */
package Module_2;

abstract class Marks {
	public abstract void getPercentage();
}

class StudentsA extends Marks {
	int maths;
	int sci;
	int eng;

	public void getPercentage() {
		float Per = (maths + sci + eng) / 3;
		System.out.println("Percentage of Student A : " + Per);
	}

	public StudentsA(int maths, int sci, int eng) {
		super();
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}
}

class StudentsB extends Marks {
	int maths;
	int sci;
	int eng;
	int ss;

	public void getPercentage() {
		float Per = (maths + sci + eng + ss) / 4;
		System.out.println("Percentage of Student A : " + Per);
	}

	public StudentsB(int maths, int sci, int eng, int ss) {
		super();
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.ss = ss;
	}
}

public class O018_Calc_Per {
	public static void main(String[] args) {

		StudentsA a1 = new StudentsA(60, 60, 60);
		a1.getPercentage();

		StudentsB b1 = new StudentsB(80, 80, 80, 80);
		b1.getPercentage();
	}
}
