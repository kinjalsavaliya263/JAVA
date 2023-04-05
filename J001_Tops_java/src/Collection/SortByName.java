package Collection;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		String n1 = o1.Name; // new
		String n2 = o2.Name; // exist
		return -n1.compareTo(n2);
	}

}
