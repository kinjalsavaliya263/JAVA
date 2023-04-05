/*
 * Write a Java program to convert a hash set to a List/ArrayList.
 */

package Module_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class O060_HashSet_to_List_ArrayList {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("kinjal");
		set.add("smruti");
		set.add("darshna");
		set.add("chandni");
		set.add("kajal");
		set.add("dipti");
		System.out.println("original HashSet : " + set);
		List<String> list = new ArrayList<String>(set);
		System.out.println("List : " + list);
	}
}
