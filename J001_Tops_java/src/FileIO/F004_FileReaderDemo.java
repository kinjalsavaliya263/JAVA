package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F004_FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\New folder (2)\\test2.txt");
			int i = fr.read();
			while (i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
