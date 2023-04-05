/*
 * Create a class named 'Member' having the following members:
	Data members 
	Name
	Age
	Phone number
	Address 5 - Salary
  It also has a method named 'printSalary' which prints the salary of the members.
	Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
	The 'Employee' and 'Manager' classes have data members 'specialization' and 
	'department' respectively. 
  Now, assign name, age, phone number, address and salary to an employee and a manager
  by making an object of both of these classes and print the same.
 */

package Module_2;

class Members {
	int DataMembers = 1;
	String Name = "kinjal";
	int Age = 26;
	String PhoneNumber = "9876543210";
	int Salary = 30000;

	public void printSalary() {
		System.out.println("Data members : " + DataMembers);
		System.out.println("Name : " + Name);
		System.out.println("Age : " + Age);
		System.out.println("PhoneNumber : " + PhoneNumber);
		System.out.println("Salary : " + Salary);
	}
}

class Employee extends Members {
	String specialization = "JAVA";

	public void display1() {
		printSalary();
		System.out.println("specialization : " + specialization);
	}
}

class Manager extends Members {
	String department = "Backend";

	public void display2() {
		printSalary();
		System.out.println("department : " + department);
	}
}

public class O012_Inher_Salary {
	public static void main(String[] args) {

		System.out.println("Employee Info..............");
		Employee e1 = new Employee();
		e1.display1();

		System.out.println("Manager Info................");
		Manager m1 = new Manager();
		m1.display2();

	}
}
