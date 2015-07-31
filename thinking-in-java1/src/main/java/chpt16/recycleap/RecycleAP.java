package chpt16.recycleap;

import java.util.Enumeration;
import java.util.Vector;

import chpt16.trash.Aluminum;
import chpt16.trash.Glass;
import chpt16.trash.Paper;
import chpt16.trash.ParseTrash;
import chpt16.trash.Trash;

public class RecycleAP {
	public static void main(String[] args) {
		Vector bin = new Vector();
		// Fill up the Trash bin:
//		chpt16.trash.ParseTrash
		ParseTrash.fillBin("Trash.dat", bin);
		Vector glassBin = new Vector(), 
				paperBin = new Vector(), 
				alBin = new Vector();
		Enumeration sorter = bin.elements();
		// Sort the Trash:
		while (sorter.hasMoreElements()) {
			Object t = sorter.nextElement();
			// RTTI to show class membership:
			if (t instanceof Aluminum)
				alBin.addElement(t);
			if (t instanceof Paper)
				paperBin.addElement(t);
			if (t instanceof Glass)
				glassBin.addElement(t);
		}
		Trash.sumValue(alBin);
		Trash.sumValue(paperBin);
		Trash.sumValue(glassBin);
		Trash.sumValue(bin);
	}
} // /:~
