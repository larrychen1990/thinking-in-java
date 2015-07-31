package chpt16.trashvisitor;

import chpt16.trash.Glass;

public class VGlass extends Glass implements Visitable {
	public VGlass(double wt) {
		super(wt);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
} // /:~
