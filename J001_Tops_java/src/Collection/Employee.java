package Collection;

public class Employee {
	int eid;
	String Name;
	double salary;
	String dept;

	public Employee(int eid, String name, double salary, String dept) {
		super();
		this.eid = eid;
		Name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public void display() {
		System.out.println(eid + " " + Name + " " + salary + " " + dept);
	}

}
