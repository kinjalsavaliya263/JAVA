/*
 *  Write a Java program to shuffle elements in an array list.
 */

package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class O048_Shuffle {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");
		al.add("White");

		System.out.println("List before shuffling:\n" + al);
		Collections.shuffle(al);
		System.out.println("List after shuffling:\n" + al);

//		for (String s : al) {
//			System.out.println(s);
//		}
	}
}
