package chpt16.trashvisitor;

interface Visitor {
	void visit(VAluminum a);

	void visit(VPaper p);

	void visit(VGlass g);

	void visit(VCardboard c);
} // /:~
