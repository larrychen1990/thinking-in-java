package chpt6;

class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void f() {
		System.out.println("f()");
	}
}

// ! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		System.out.println("n.i="+n.i);
		n.j++;
		System.out.println("n.j="+n.j);
	}
}
