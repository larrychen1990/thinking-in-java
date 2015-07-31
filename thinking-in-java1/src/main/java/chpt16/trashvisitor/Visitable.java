package chpt16.trashvisitor;


interface Visitable {
  // The new method:
  void accept(Visitor v);
} ///:~

 