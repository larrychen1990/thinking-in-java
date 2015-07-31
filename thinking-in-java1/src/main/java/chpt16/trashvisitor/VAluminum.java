package chpt16.trashvisitor;

import chpt16.trash.Aluminum;

public class VAluminum extends Aluminum implements Visitable {
	public VAluminum(double wt) {
		super(wt);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
} // /:~
