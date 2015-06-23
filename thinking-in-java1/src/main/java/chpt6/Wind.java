package chpt6;

//: Wind.java
//Inheritance & upcasting
import java.util.*;

class Instrument {
	public void play() {
		System.out.println("Instrument play");
	}

	static void tune(Instrument i) {
		// ...
		i.play();
	}
}

// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
	public void play(){
		System.out.println("Wind play");
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		flute.tune(flute);
//		Instrument.tune(flute); // Upcasting
	}
}
