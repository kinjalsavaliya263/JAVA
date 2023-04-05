package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C008_StudentCollection {
	public static void main(String[] args) {
		ArrayList<C008_Student> al = new ArrayList<C008_Student>();
		al.add(new C008_Student(10, "saurabh", "saurabh@gmail.com"));
		al.add(new C008_Student(20, "nidhi", "nidhi@gmail.com"));
		al.add(new C008_Student(4, "kinjal", "kinjal@gmail.com"));

		Iterator<C008_Student> itr = al.iterator();
		while (itr.hasNext()) {
//			C0008_Student c0008_Student = (C0008_Student) itr.next();
			itr.next().display();

		}
	}

}
