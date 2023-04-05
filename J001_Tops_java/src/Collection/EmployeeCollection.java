
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeCollection {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "Tops", 596.55, "Java"));
		emp.add(new Employee(12, "Nidhi", 8484.45, "Php"));
		emp.add(new Employee(5, "Saurabh", 1519.15, "Selenium"));
		emp.add(new Employee(2, "kinjal", 548.545, "Testing"));

//		Collections.sort(emp, new SortById());
//		Collections.sort(emp, new SortBySalary());
		Collections.sort(emp, new SortByDept());
//		Collections.sort(emp, new SortByName());

		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			itr.next().display();

		}
	}
}
