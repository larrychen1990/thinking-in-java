package com.hawk.c01.custom.sort;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.h2.command.dml.Merge;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.thoughtworks.xstream.core.util.QuickWriter;

@FixMethodOrder(MethodSorters.JVM)
public class SortTest {

	@Test
	@Ignore
	public void insertSort() {
		int[] intArr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18,
						23, 34, 15, 35, 25, 53, 51 };

		for (int n = 1; n < intArr.length; n++) {

			int m = n - 1;
			int temp = intArr[n];

			for (; m >= 0 && temp < intArr[m]; m--) {
				intArr[m + 1] = intArr[m];
			}
			intArr[m + 1] = temp;

		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + ",");
		}

	}

	@Test
	@Ignore
	public void shellSort() {
		int a[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100 };
		double d1 = a.length;
		int temp = 0;
		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;

			for (int x = 0; x < d; x++) {

				for (int i = x + d; i < a.length; i += d) {
					int j = i - d;
					temp = a[i];
					for (; j >= 0 && temp < a[j]; j -= d) {
						a[j + d] = a[j];
					}
					a[j + d] = temp;
				}

			}

			if (d == 1) {
				break;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

	@Test
	@Ignore
	public void selectSort() {
		int a[] = { 10, 54, 6, 3, 78, 34, 12, 45 };
		int position = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int j = i + 1;
			position = i;

			int min = a[i];

			for (; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = min;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	@Test
	@Ignore
	public void bubbleSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34,
						15, 35, 25, 53, 51 };
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

	@Test
	@Ignore
	public void quickSort() {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34,
						15, 35, 25, 53, 51 };

		quick(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	private void quick(int[] a2) {
		if (a2.length > 0) { // 查看数组是否为空
			_quickSort(a2, 0, a2.length - 1); // low, high
		}
	}

	private void _quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list, low, high); // 将list数组进行一分为二

			_quickSort(list, low, middle - 1); // 对低字表进行递归排序
			_quickSort(list, middle + 1, high); // 对高字表进行递归排序
		}
	}

	private int getMiddle(int[] list, int low, int high) {
		int tmp = list[low]; // 数组的第一个作为中轴

		while (low < high) {
			while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high]; // 比中轴小的记录移到低端
			while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low]; // 比中轴大的记录移到高端
		}
		list[low] = tmp; // 中轴记录到尾

		return low; // 返回中轴的位置
	}

	@Test
	public void mergingSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34,
						15, 35, 25, 53, 51 };
		
		
		
	}
	
	public void sort(int[] data, int left, int right){
		
	}
	
	public void merge(int[] data, int left, int center, int right){
		
	}

	@Test
	@Ignore
	public void tt() {
		double a = 5.0 / 2;
		System.out.println(a);
		System.out.println(Math.ceil(a));

	}
}
