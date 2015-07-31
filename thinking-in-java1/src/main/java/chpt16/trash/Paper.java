package chpt16.trash;

public class Paper extends Trash {
	private static double val = 1.67f;

	public Paper(double wt) {
		super(wt);
	}

	public double value() {
		return val;
	}

	public static void value(double newVal) {
		val = newVal;
	}
} // /:~
