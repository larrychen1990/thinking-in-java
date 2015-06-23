package chpt10.xfiles;

//: ThawAlien.java
//Try to recover a serialized file without the 
//class of object that's stored in that file.
import java.io.*;

public class ThawAlien {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"src/chpt10/file.x"));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass().toString());
	}
} // /:~
