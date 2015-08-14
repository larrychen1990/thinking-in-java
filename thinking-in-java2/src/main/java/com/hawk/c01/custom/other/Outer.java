package com.hawk.c01.custom.other;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class Outer {
	private int x = 100;
	private String s = "outer";
	
	//  Static Nested Classes
	static class StaticInner {
		void go() {
			System.out.println("Inner class reference is: " + this);
			System.out.println(new Outer().x);
		}
	}


	public void makeInner() {
		InnerClass in = new InnerClass();
		in.seeOuter();
	}

	// Member Inner Class
	class InnerClass {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class reference is " + this);
			System.out.println("Outer class reference is " + Outer.this);
		}
	}
	
	// Method-Local Inner Classes
	 
	public void doStuff() {
		class MyInner {
			public void seeOuter() {
				System.out.println("s is " + s);
			}
		}
 
		MyInner i = new MyInner();
		i.seeOuter();
	}

	public static void main(String[] args) {
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.go();
		
		Outer outer = new Outer();
		outer.makeInner();
		outer.doStuff();
		
		
		// Anonymous Inner Classes
//		button.addActionListener(new ActionListener(){
//		     public void actionPerformed(ActionEvent e){
//		         comp.setText("Button has been clicked");
//		     }
//		});
	}
}

class MapImpl implements Map{

	class ImplEntry implements Map.Entry{

		public Object getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object setValue(Object value) {
			// TODO Auto-generated method stub
			return null;
		}		
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
}