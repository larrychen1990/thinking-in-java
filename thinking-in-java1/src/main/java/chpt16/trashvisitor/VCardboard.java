package chpt16.trashvisitor;

import chpt16.trash.Cardboard;

public class VCardboard extends Cardboard implements Visitable {
	public VCardboard(double wt) {
		super(wt);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
} // /:~
