package chpt10;

//: FreezeAlien.java
//Create a serialized output file
import java.io.*;

public class FreezeAlien {
	public static void main(String[] args) throws Exception {
		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("src/chpt10/file.x"));
		Alien zorcon = new Alien();
		out.writeObject(zorcon);
	}
} // /:~
