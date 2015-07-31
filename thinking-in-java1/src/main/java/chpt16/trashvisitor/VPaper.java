package chpt16.trashvisitor;

import chpt16.trash.Paper;

public class VPaper extends Paper implements Visitable {
	public VPaper(double wt) {
		super(wt);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
} // /:~