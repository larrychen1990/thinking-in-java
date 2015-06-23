package chpt11;

public class Test {
	public static void main(String[] args) {
		String s="class chpt11.p2.Hamster";
		System.out.println(s.substring(2));
		System.out.println(s.substring(s.lastIndexOf('.')+1));
		Test t=new Test();
		
		System.out.println(Test.class.isInstance(t));
		
		String ss="ss",fg;
		fg="fgk";
		System.out.println(ss.toString());
		System.out.println(fg);
	}
}
