package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriterDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\New folder (2)\\test2.txt");
			String str = 10 + "Hello java hello tops";

			fw.write(str);

			fw.flush();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
