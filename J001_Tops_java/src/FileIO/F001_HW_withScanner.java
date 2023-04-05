
package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_HW_withScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String n = sc.nextLine();
		System.out.println("Enter string : ");
		String s = sc.nextLine();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\New folder (2)\\" + n + ".txt");
			System.out.println("file created..");
			byte b[] = s.getBytes();
			fos.write(b);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
