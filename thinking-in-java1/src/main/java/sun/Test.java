package sun;

public class Test {
	public static String output = "";

	public static void foo(int i) {
		try {
			if (i == 1) {
				throw 
				new Exception();
			}
			output += "1";
		} catch (Exception e) {
			e.printStackTrace();
			output += "2";
			return;
		} finally {
			output += "3";
		}
		output += "4";
	}

	public static void main(String args[]) {
		foo(0);
		foo(1);
		System.out.println(output);
		foo(2);
		foo(3);

	}
}