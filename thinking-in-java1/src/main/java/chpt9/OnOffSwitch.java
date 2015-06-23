package chpt9;

//: OnOffSwitch.java
//Why use finally?

class Switch {
	private boolean state = false;

	boolean read() {
		return state;
	}

	void on() {
		state = true;
	}

	void off() {
		state = false;
	}
}

public class OnOffSwitch {
	static Switch sw = new Switch();

	public static void main(String[] args) {
		try {
			sw.on();
			System.out.println(sw.read());
			// Code that can throw exceptions...
			sw.off();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			sw.off();
		} catch (IllegalArgumentException e) {
			System.out.println("IOException");
			sw.off();
		}
	}
} // /:~
