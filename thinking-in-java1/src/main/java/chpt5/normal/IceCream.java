package chpt5.normal;

//: IceCream.java
//Demonstrates "private" keyword

class Sundae {
	private Sundae() {
		System.out.println("SC");  
	}

	static Sundae makeASundae() {
//		System.out.println("mk");
		return new Sundae();
	}
}

public class IceCream {
	public static void main(String[] args) {
		// ! Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
} // /:~

