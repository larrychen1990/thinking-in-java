package chpt6;

//: Orc.java
//The protected keyword
import java.util.*;

class Villain {
	private int i;

	protected int read() {
		return i;
	}

	protected void set(int ii) {
		i = ii;
	}

	public Villain(int ii) {
		i = ii;
	}

	public int value(int m) {
		return m * i;
	}
}

public class Orc extends Villain {
	private int j;

	public Orc(int jj) {
		super(jj);
		j = jj;
		System.out.println("OrcJ="+j);
	}

	public void change(int x) {
		set(x);
	}
	public static void main(String[] args) {
		Orc o= new Orc(5);
		o.change(3);
		System.out.println(o.read());
		System.out.println(o.value(2));
	}
} // /:~
