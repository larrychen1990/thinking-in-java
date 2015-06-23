package sun;

 class Foo {
	public void main(String[] args) {
		System.out.println("Hello" + args[0]);
	}
}

 public class Ie2 {

	public void foo(boolean a, boolean b) {
		if (a) {
			System.out.println("A");
		} else if (a && b) {
			System.out.println("A&&B");
		} else {
			if (!b) {
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}
	}
	public static void main(String[] args) {
		Ie2 ie=new Ie2();
		ie.foo(false,true);
		 boolean results[] = new boolean [3];// {true, false, true};
		 System.out.println(results[0]);
		 System.out.println(results[1]);
		 System.out.println(results[2]);
	}
}