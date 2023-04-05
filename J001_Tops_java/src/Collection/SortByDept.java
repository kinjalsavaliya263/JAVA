
package Collection;

import java.util.Comparator;

public class SortByDept implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String d1 = o1.dept;
		String d2 = o2.dept;

		return d1.compareTo(d2);
	}

}
