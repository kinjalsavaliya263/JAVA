package Collection;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double s1 = o1.salary;
		double s2 = o2.salary;
		int k = 0;
		if (s1 > s2) {
			k = 1;
		} else if (s1 < s2) {
			k = -1;
		} else {
			k = 0;
		}
		return k;

	}

}
