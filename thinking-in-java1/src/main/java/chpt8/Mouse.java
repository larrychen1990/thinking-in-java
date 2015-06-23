package chpt8;

public class Mouse {
	private int num;

	public Mouse() {
	}

	public Mouse(int i) {
		num = i;
		System.out.println("create Mouse " + i);
	}

	@Override
	public String toString() {
		return "Mouse " + num;
	}

}
