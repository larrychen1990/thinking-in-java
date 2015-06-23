package chpt10;

//: Redirecting.java
//Demonstrates the use of redirection for 
//standard IO in Java 1.1
import java.io.*;

class Redirecting {
	public static void main(String[] args) {
		try {
			BufferedInputStream in = new BufferedInputStream(
					new FileInputStream("src/chpt10/Redirecting.java"));
			// Produces deprecation message:
			PrintStream out = new PrintStream(new BufferedOutputStream(
					new FileOutputStream("src/chpt10/test.out")));
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s;
			while ((s = br.readLine()) != null)
				System.out.println(s);
			out.close(); // Remember this!
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} // /:~
