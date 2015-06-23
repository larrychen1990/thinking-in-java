package chpt8;

public class Hamster {
	private int num;

	public Hamster() {
	}

	public Hamster(int i) {
		num = i;
		System.out.println("create Hamster " + i);
	}

	@Override
	public String toString() {
		return "Hamster " + num;
	}
}
