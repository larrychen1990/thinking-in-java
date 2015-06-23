package chpt16;

public class Test {
	private static int counter = 0;
	private int id = counter++;

	public void prt(){
		System.out.println(id);
	}
	public static void main(String[] args) {
	System.out.println((int)(Math.random() *10));
	}
}
