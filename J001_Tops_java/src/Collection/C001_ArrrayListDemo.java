/*
 *		 //default inialization : 10
		// ( oldsize * 3/2 )+ 1 : 16
		// maintain insertion order 
		//allowed duplication
		//allowed multiple null
 */
package Collection;

import java.util.ArrayList;

public class C001_ArrrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("android");
		al.add(null);
		al.add(".net");
		al.add("sql");
		al.add("node");
		al.add("react");
		al.add("rubby");
		al.add("angular");
		al.add("express");

//		al.add(2, "sql");
//		al.set(2, "sql");
//		al.remove(2);
//		System.out.println(al.size());
		System.out.println(al.get(1));

//		for (String s : al) {
//			System.out.println(s);
//		}
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

//		for (int i = 0; i < al.size(); i++) {
//			if (i % 2 != 0) {
//				System.out.println(al.get(i));
//			}
//		}

	}
}
