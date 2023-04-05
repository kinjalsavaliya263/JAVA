/*
 *  Write a Java program to compare two array lists.
 */

package Module_2;

import java.util.ArrayList;
import java.util.List;

public class O056_Compare_Two_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kinjal");
		list.add("smruti");
		list.add("darshna");
		list.add("chandni");
		System.out.println(list);

		System.out.println("****************************");
		List<String> list1 = new ArrayList<String>();
		list1.add("kinjal");
		list1.add("smruti");
		list1.add("darshna");
		list1.add("chandni");
		list1.add("kajal");
		System.out.println(list1);
		System.out.println("****************************");
		System.out.println(list.equals(list1));

	}
}
