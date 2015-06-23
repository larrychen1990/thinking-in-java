package chpt5;

import com.eagle.tools.debug.Assert;


//: TestAssert.java
//Demonstrating the assertion tool
//Comment the following, and uncomment the
//subsequent line to change assertion behavior:
//import com.bruceeckel.tools.*;

public class TestAssert {
	public static void main(String[] args) {
		Assert.is_true((2 + 2) == 5);
		Assert.is_false((1 + 1) == 2);
		Assert.is_true((2 + 2) == 5, "2 + 2 == 5");
		Assert.is_false((1 + 1) == 2, "1 +1 != 2");
	}
} // /:~
