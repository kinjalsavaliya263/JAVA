/*
 *  Write a Java program to increase the size of an array list.
 */

package Module_2;

import java.util.ArrayList;

public class O062_Increase_Size_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		System.out.println(al);
		System.out.println(al.size());
		al.ensureCapacity(10);
		System.out.println(al.size());
	}
}
