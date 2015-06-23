package chpt10;

//: NewIODemo.java
//Java 1.1 IO typical usage
import java.io.*;

public class NewIODemo {
	public static void main(String[] args) {
		try {
			// 1. Reading input by lines:
			System.out.println("------------1------------");
			BufferedReader in = new BufferedReader(new FileReader("src/chpt10/Data2.txt"));
			String s, s2 = new String();
			while ((s = in.readLine()) != null)
				s2 += s + "\n";
			System.out.println(s2);
			in.close();
			System.out.println("------------1------------");

			// 1b. Reading standard input:
			System.out.println("------------1b------------");
			BufferedReader stdin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.print("Enter a line:");
			System.out.println(stdin.readLine());
			System.out.println("------------1b------------");

			// 2. Input from memory
			System.out.println("------------2------------");
			StringReader in2 = new StringReader(s2);
			int c;
			while ((c = in2.read()) != -1)
				System.out.print((char) c);
			System.out.println("------------2------------");

			// 3. Formatted memory input
			System.out.println("------------3------------");
			try {
				DataInputStream in3 = new DataInputStream(
				// Oops: must use deprecated class:
						new StringBufferInputStream(s2));
				while (true)
					System.out.print((char) in3.readByte());
			} catch (EOFException e) {
				System.out.println("End of stream");
			}
			System.out.println("------------3------------");

			// 4. Line numbering & file output
			System.out.println("------------4------------");
			try {
				LineNumberReader li = new LineNumberReader(new StringReader(s2));
				BufferedReader in4 = new BufferedReader(li);
				PrintWriter out1 = new PrintWriter(new BufferedWriter(
						new FileWriter("src/chpt10/IODemo2.out")));
				while ((s = in4.readLine()) != null)
					out1.println("Line " + li.getLineNumber() + s);
				out1.close();
			} catch (EOFException e) {
				System.out.println("End of stream");
			}
			System.out.println("------------4------------");

			// 5. Storing & recovering data
			System.out.println("------------5------------");
			try {
				DataOutputStream out2 = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(
								"src/chpt10/Data5.txt")));
				out2.writeDouble(3.14159);
				out2.writeBytes("That was pi");
				out2.close();
				DataInputStream in5 = new DataInputStream(
						new BufferedInputStream(new FileInputStream("src/chpt10/Data5.txt")));
				BufferedReader in5br = new BufferedReader(
						new InputStreamReader(in5));
				// Must use DataInputStream for data:
				System.out.println(in5.readDouble());
				// Can now use the "proper" readLine():
				System.out.println(in5br.readLine());
			} catch (EOFException e) {
				System.out.println("End of stream");
			}
			System.out.println("------------5------------");

			// 6. Reading and writing random access
			// files is the same as before.
			// (not repeated here)

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + args[1]);
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
} // /:~
