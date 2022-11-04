package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	// throw : exception을 미룰 수 있다.
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowException ex = new ThrowException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { // 맨 마지막에 써야한다.
			System.out.println(e);
		}
		System.out.println("end");
	}

}
