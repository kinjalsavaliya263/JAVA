
package FileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class F002_FileInputStream {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\New folder (2)\\test.txt");
			int i = fis.read();
			while (i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
