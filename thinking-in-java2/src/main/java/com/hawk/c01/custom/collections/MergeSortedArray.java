package com.hawk.c01.custom.collections;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.jetty.util.ArrayUtil;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class MergeSortedArray {
	public static void merge2(int A[], int m, int B[], int n) {

		while (m > 0 && n > 0) {
			if (A[m - 1] > B[n - 1]) {
				A[m + n - 1] = A[m - 1];
				m--;
			} else {
				A[m + n - 1] = B[n - 1];
				n--;
			}
		}

		while (n > 0) {
			A[m + n - 1] = B[n - 1];
			n--;
		}
	}

	public static int[] merge(int A[], int m, int B[], int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		
		
		int[] C = new int[k+1];

		while (k >= 0) {
			if (j < 0 || (i >= 0 && A[i] > B[j]))
				C[k--] = A[i--];
			else
				C[k--] = B[j--];
		}
		return C;
	}
	
	public static void main(String[] args) {
		
		
		int[] a  = new int[]{1,2,3,4,5};
		int[] b  = new int[]{3,4,5,6,7};
		
		int[] merge = merge(a, a.length, b, b.length);
		
		for (int i = 0; i < merge.length; i++) {
			System.out.println(merge[i]);
		}
		
		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
		for (byte bt : bytes) {
			System.out.format("0x%x" ,bt);
		}
		System.out.println();
		
		int binarySearch = Arrays.binarySearch(a, 3);
		System.out.println(binarySearch);
	}
}
