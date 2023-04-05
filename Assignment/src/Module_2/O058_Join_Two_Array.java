/*
 * Write a Java program to join two array lists.
 */

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class O058_Join_Two_Array {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("kinjal");
		list1.add("smruti");
		list1.add("darshna");
		list1.add("chandni");
		List<String> list2 = new ArrayList<String>();
		list2.add("kinju");
		list2.add("suru");
		list2.add("darshu");
		list2.add("chand");

		System.out.println("First List1 : " + list1);
		list1.addAll(list2);
		System.out.println("Second List1 : " + list1);

	}
}
