
package FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class F002_HW_withScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String n = sc.nextLine();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D:\\New folder (2)\\" + n + ".txt");
			int i = fis.read();
			while (i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}

	}
}
