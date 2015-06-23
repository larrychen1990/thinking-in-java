package chpt12;

public class Test {
	public  int data;
	public  Test chData(int d){
		data=d;
		return this;
	}
public static void main(String[] args) {
	Test t= new Test();
	System.out.println(t.chData(9));
}
}
