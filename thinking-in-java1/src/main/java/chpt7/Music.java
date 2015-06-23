package chpt7;

class Note {
	private int value;

	private Note(int val) {
		value = val;
	}

	public static final Note 
							middleC = new Note(0), 
							cSharp = new Note(1),
							cFlat = new Note(2);
	public void prt(){
		System.out.println(value);
	}
} // Etc.

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}

// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
	// Redefine interface method:
	private int val;
	public void play(Note n) {
		n.prt();
		System.out.println("Wind.play()");
	}
}

public class Music {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.cSharp);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
} // /:~
