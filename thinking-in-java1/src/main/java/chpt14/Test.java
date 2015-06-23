package chpt14;

public class Test {
	static int i;
	public  String getClazz() {
		System.out.println(getClass());
		System.out.println(getClass().getName());
		return getClass().getName();
	}

	public static void main(String[] args) {
//		Test t=new Test();
//		t.getClazz();
		System.out.println(++i);

	}
}
