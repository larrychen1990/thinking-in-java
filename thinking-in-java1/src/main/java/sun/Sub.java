package sun;

public class Sub extends Super {
	public Long GetLenght() {
		return  
//				5;
				new Long(5);
	}

	public static void main(String[] args) {
		Super sooper = new Super();
		Sub sub = new Sub();
		System.out.println(sooper.getLenght().toString() + ","
				+ sub.getLenght().toString());
//		System.out.println(sub.GetLenght().toString());
	}
}

class Super {
	public Integer getLenght() {

		return
//				4;
				new Integer(4);
	}
}
