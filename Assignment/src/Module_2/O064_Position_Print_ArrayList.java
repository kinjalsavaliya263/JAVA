/*
 * Write a Java program to print all the elements of an ArrayList using the 
	position of the elements. 
 */

package Module_2;

import java.util.ArrayList;

public class O064_Position_Print_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kinjal");
		list.add("Smruti");
		list.add("Drshna");
		list.add("Chandni");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
}
