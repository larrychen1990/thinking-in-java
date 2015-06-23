package chpt10;

//: IOStreamDemo.java
//Typical IO Stream Configurations
import java.io.*;

import com.eagle.tools.InFile;
import com.eagle.tools.OutFile;
import com.eagle.tools.PrintFile;

public class IOStreamDemo {
	public static void main(String[] args) {
		try {
			// 1. Buffered input file
			String path = "src/chpt10/IOTest.txt";
			// DataInputStream in = new DataInputStream(new BufferedInputStream(
			// new FileInputStream(args[0])));
			DataInputStream in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(path)));

			String s, s2 = new String();
			while ((s = in.readLine()) != null)
				s2 += s + "\n";
			in.close();

			// 2. Input from memory
			System.out.println("2");
			StringBufferInputStream in2 = new StringBufferInputStream(s2);
			int c;
			while ((c = in2.read()) != -1)
				System.out.print((char) c);
			System.out.println("2");

			System.out.println("3");
			// 3. Formatted memory input
			try {
				DataInputStream in3 = new DataInputStream(
						new StringBufferInputStream(s2));
				while (true)
					System.out.print((char) in3.readByte());
			} catch (EOFException e) {
				System.out.println("End of stream encountered");
			}
			System.out.println("3");

			System.out.println("4");
			// 4. Line numbering & file output
			try {
				LineNumberInputStream li = new LineNumberInputStream(
						new StringBufferInputStream(s2));
				DataInputStream in4 = new DataInputStream(li);
				PrintStream out1 = new PrintStream(new BufferedOutputStream(
						new FileOutputStream("src/chpt10/IODemo.out")));
				while ((s = in4.readLine()) != null)
					out1.println("Line " + li.getLineNumber() + " " + s);
				out1.close(); // finalize() not reliable!
			} catch (EOFException e) {
				System.out.println("End of stream encountered");
			}
			System.out.println("4");

			System.out.println("5");
			// 5. Storing & recovering data
			try {
				DataOutputStream out2 = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(
								"src/chpt10/Data.txt")));
				out2.writeBytes("Here's the value of pi: \n");
				out2.writeDouble(3.14159);
				out2.close();
				DataInputStream in5 = new DataInputStream(
						new BufferedInputStream(new FileInputStream(
								"src/chpt10/Data.txt")));
				System.out.println(in5.readLine());
				System.out.println(in5.readDouble());
			} catch (EOFException e) {
				System.out.println("End of stream encountered");
			}
			System.out.println("5");

			System.out.println("6");
			// 6. Reading/writing random access files
			RandomAccessFile rf = new RandomAccessFile("src/chpt10/rtest.dat",
					"rw");
			for (int i = 0; i < 10; i++)
				rf.writeDouble(i * 1.414);
			rf.close();

			rf = new RandomAccessFile("src/chpt10/rtest.dat", "rw");
			rf.seek(5 * 8);
			rf.writeDouble(47.0001);
			rf.close();

			rf = new RandomAccessFile("src/chpt10/rtest.dat", "r");
			for (int i = 0; i < 10; i++)
				System.out.println("Value " + i + ": " + rf.readDouble());
			rf.close();
			System.out.println("6");

			// 7. File input shorthand
			System.out.println("7");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("src/chpt10/Data.txt")));
			String ss = new String();
			StringBuffer sb = new StringBuffer();
			while ((ss = br.readLine()) != null) {
				sb.append(ss + "\n");
			}
			System.out.println(sb);
			InFile in6 = new InFile("src/chpt10/Data.txt");
			String s3 = new String();
			System.out.println("First line in file: " + in6.readLine());
			in6.close();
			System.out.println("----------------------");

			System.out.println("----------------------");
			System.out.println("7");

			// 8. Formatted file output shorthand
			System.out.println("8");
			PrintStream out3 = new PrintStream("src/chpt10/Data2.txt");
			out3.print("Test of PrintFile.嘿嘿");
			out3.close();
			System.out.println("----------------------");
			PrintFile out33 = new PrintFile("src/chpt10/Data2.txt");
			out33.print("Test of PrintFile");
			out33.close();
			System.out.println("----------------------");
			System.out.println("8");

			// 9. Data file output shorthand
			System.out.println("9");
			PrintWriter pw = new PrintWriter("src/chpt10/Data3.txt");
			pw.write("pw simida!没有乱码");
			pw.close();
			System.out.println("----------------------");
			OutFile out4 = new OutFile("src/chpt10/Data3.txt");
			out4.writeBytes("Test of outDataFile\n\r");
			out4.writeChars("Test of outDataFile\n\r");
			out4.close();
			System.out.println("----------------------");
			System.out.println("9");

			// 10.Object file output
			System.out.println("10");
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("src/chpt10/Data4.txt"));
			oos.writeBytes("good");
			oos.writeChar(89);
			oos.writeChars("mimi");
			oos.close();
			System.out.println("10");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + args[0]);
		} catch (IOException e) {
			System.out.println("IO Exception");
			System.out.println(e.getMessage());
		}
	}
} // /:~

