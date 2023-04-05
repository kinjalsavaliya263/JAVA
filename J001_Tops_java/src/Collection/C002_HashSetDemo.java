
package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class C002_HashSetDemo {
	public static void main(String[] args) {

		// only one null allowed
		// initial size : 16
		// load factor : 0.75
		// etle ke 12 e phochiya pachi e double thai jase...
		// not allowed duplication
		// output insertion order ma maltu nathi (type karel kram ma maltu nathi.)

		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("corejava");
		set.add("android");
		set.add("java");
		set.add("ios");
		set.add("sql");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
