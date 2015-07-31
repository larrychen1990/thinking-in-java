package chpt16.trash;

import java.util.Vector;

public class FillableVector implements Fillable {
	private Vector v;

	public FillableVector(Vector vv) {
		v = vv;
	}

	public void addTrash(Trash t) {
		v.addElement(t);
	}
} // /:~
