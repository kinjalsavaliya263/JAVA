/*
 *  Write a Java program of swap two elements in an array list.
 */

package Module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O057_Swap_Two_Elements {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kinjal");
		list.add("smruti");
		list.add("darshna");
		list.add("chandni");
		System.out.println(list);
		Collections.swap(list, 2, 3);
		System.out.println(list);

	}
}
