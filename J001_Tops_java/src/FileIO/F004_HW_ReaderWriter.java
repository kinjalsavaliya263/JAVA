
package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F004_HW_ReaderWriter {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fWriter = null;
		try {
			fr = new FileReader("D:\\New folder (2)\\test2.txt");
			int i = fr.read();
			String s = "";
			while (i != -1) {
				char c = (char) i;
//				System.out.print(c);
				i = fr.read();
				s = s + c;
			}
			System.out.println(s);

			fWriter = new FileWriter("D:\\New folder (2)\\test2.txt");
			String str = "\n kinjal savaliya";
			fWriter.write(s);
			fWriter.write(str);
			fWriter.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fr.close();
			fWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
