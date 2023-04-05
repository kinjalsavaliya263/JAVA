/*
 * Write a Java program to replace the second element of an ArrayList with 
the specified element.
 */

package Module_2;

import java.util.ArrayList;

public class O063_Specified_Element_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("kinjal");
		arrayList.add("smruti");
		arrayList.add("darshna");
		arrayList.add("chandni");
		arrayList.add("kajal");
		System.out.println("First : " + arrayList);
		arrayList.set(4, "Dipti");
		System.out.println("Second : " + arrayList);
	}
}
