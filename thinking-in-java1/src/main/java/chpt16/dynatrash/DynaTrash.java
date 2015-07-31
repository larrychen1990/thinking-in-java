package chpt16.dynatrash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import chpt16.trash.Fillable;
import chpt16.trash.ParseTrash;
import chpt16.trash.Trash;

//Generic TypeMap works in any situation:
class TypeMap {
	private Hashtable t = new Hashtable();

	public void add(Object o) {
		Class type = o.getClass();
		if (t.containsKey(type))
			((Vector) t.get(type)).addElement(o);
		else {
			Vector v = new Vector();
			v.addElement(o);
			t.put(type, v);
		}
	}

	public Vector get(Class type) {
		return (Vector) t.get(type);
	}

	public Enumeration keys() {
		return t.keys();
	}

	// Returns handle to adapter class to allow
	// callbacks from ParseTrash.fillBin():
	public Fillable filler() {
		// Anonymous inner class:
		return new Fillable() {
			public void addTrash(Trash t) {
				add(t);
			}
		};
	}
}

public class DynaTrash {
	public static void main(String[] args) {
		TypeMap bin = new TypeMap();
		ParseTrash.fillBin("Trash.dat", bin.filler());
		Enumeration keys = bin.keys();
		while (keys.hasMoreElements())
			Trash.sumValue(bin.get((Class) keys.nextElement()));
	}
} // /:~
