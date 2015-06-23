package chpt11;

//: PetCount.java
//Using instanceof
import java.util.*;


class Pet {
}

class Dog extends Pet {
}

class Pug extends Dog {
}

class Cat extends Pet {
}

class Rodent extends Pet {
}

class Gerbil extends Rodent {
}

class Hamster extends Rodent {
}

class Counter {
	int i;
}

public class PetCount {
	static String[] typenames = { "Pet", "Dog", "Pug", "Cat", "Rodent",
			"Gerbil", "Hamster", };

	public static void main(String[] args) {
		Vector pets = new Vector();
		try {
			Class[] petTypes = { Class.forName("chpt11.Dog"),
					Class.forName("chpt11.Pug"),
					Class.forName("chpt11.Cat"),
					Class.forName("chpt11.Rodent"),
					Class.forName("chpt11.Gerbil"),
					Class.forName("chpt11.Hamster"), };
			for (int i = 0; i < 15; i++){
				pets.addElement(petTypes[(int) (Math.random() * petTypes.length)]
						.newInstance());
			}
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		Hashtable h = new Hashtable();
		for (int i = 0; i < typenames.length; i++)
			h.put(typenames[i], new Counter());
		for (int i = 0; i < pets.size(); i++) {
			Object o = pets.elementAt(i);
			if (o instanceof Pet)
				((Counter) h.get("Pet")).i++;
			if (o instanceof Dog)
				((Counter) h.get("Dog")).i++;
			if (o instanceof Pug)
				((Counter) h.get("Pug")).i++;
			if (o instanceof Cat)
				((Counter) h.get("Cat")).i++;
			if (o instanceof Rodent)
				((Counter) h.get("Rodent")).i++;
			if (o instanceof Gerbil)
				((Counter) h.get("Gerbil")).i++;
			if (o instanceof Hamster)
				((Counter) h.get("Hamster")).i++;
		}
		for (int i = 0; i < pets.size(); i++)
			System.out.println(pets.elementAt(i).getClass().toString());
		for (int i = 0; i < typenames.length; i++)
			System.out.println(typenames[i] + " quantity: "
					+ ((Counter) h.get(typenames[i])).i);
	}
} // /:~
