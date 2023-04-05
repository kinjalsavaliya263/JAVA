package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\New folder (2)\\test.txt");
			System.out.println("file created......");
			String s = "This is my first io practical";
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("written!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
