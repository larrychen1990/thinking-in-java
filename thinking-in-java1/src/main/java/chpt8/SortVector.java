package chpt8;

//: SortVector.java
//A generic sorting vector
import java.util.*;

public class SortVector extends Vector {
	private Compare compare; // To hold the callback

	public SortVector(Compare comp) {
		compare = comp;
	}

	public void sort() {
		quickSort(0, size() - 1);//size()是vector类里固有的方法，
	}

	private void quickSort(int left, int right) {
		if (right > left) {
			Object o1 = elementAt(right);
			int i = left - 1;
			int j = right;
			while (true) {
				while (compare.lessThan(elementAt(++i), o1))
					;
				while (j > 0)
					if (compare.lessThanOrEqual(elementAt(--j), o1))
						break; // out of while
				if (i >= j)
					break;
				swap(i, j);
			}
			swap(i, right);
			quickSort(left, i - 1);
			quickSort(i + 1, right);
		}
	}

	private void swap(int loc1, int loc2) {
		Object tmp = elementAt(loc1);
		setElementAt(elementAt(loc2), loc1);
		setElementAt(tmp, loc2);
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		v.add(1);
		v.add(3);
		v.add(2);
		v.add(19);
		v.add(10);
//		Collections.sort(v);
		System.out.println(v);
		
	}
} // /:~