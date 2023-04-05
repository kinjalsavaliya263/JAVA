package FileIO;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {

		File file = new File("D:\\New folder (2)\\hello");

		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

//		file.mkdir();

//		if (file.exists()) {
//			System.out.println("file is avaialble.....");
//			file.delete();
//		} else {
//			System.out.println("file is not avaialble....");
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
