package com.hawk.c01.custom.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class SortTest {

	@Test
	@Ignore
	public void synthesizedSort() {

	}

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
	public void binaryInsertSort() {
		int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1 };

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;

			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < a[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}

			for (int j = i - 1; j >= left; j--) { // move back 1 if neccesary
				a[j + 1] = a[j];
			}

			if (left != i) {
				a[left] = temp; // insert current value into the binary left
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
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
	public void heapSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34,
						15, 35, 25, 53, 51 };

		int arrayLength = a.length;
		// 循环建堆
		for (int i = 0; i < arrayLength - 1; i++) {
			// 建堆
			buildMaxHeap(a, arrayLength - 1 - i);
			// 交换堆顶和最后一个元素
			swap(a, 0, arrayLength - 1 - i);
			System.out.println(Arrays.toString(a));
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	private void swap(int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	// 对data数组从0到lastIndex建大顶堆
	private void buildMaxHeap(int[] data, int lastIndex) {

		// 从lastIndex处节点（最后一个节点）的父节点开始
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// k保存正在判断的节点
			int k = i;
			// 如果当前k节点的子节点存在
			while (2 * k + 1 <= lastIndex) {
				// k节点的左子节点的索引
				int biggerIndex = 2 * k + 1;
				// 如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
				if (biggerIndex < lastIndex) {
					// 如果右子节点的值较大
					if (data[biggerIndex] < data[biggerIndex + 1]) {
						// biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				// 如果k节点的值小于其较大的子节点的值
				if (data[k] < data[biggerIndex]) {
					// 交换他们
					swap(data, k, biggerIndex);
					// 将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
					k = biggerIndex;
				} else {
					break;
				}

			}

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
	@Ignore
	public void mergingSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34,
						15, 35, 25, 53, 51 };

		sort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	private void sort(int[] data, int left, int right) {
		if (left < right) {
			// 找出中间索引
			int center = (left + right) / 2;

			// 对左边数组进行递归
			sort(data, left, center);

			// 对右边数组进行递归
			sort(data, center + 1, right);

			// 合并
			merge(data, left, center, right);

		}
	}

	private void merge(int[] data, int left, int center, int right) {
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		// third记录中间数组的索引
		int third = left;
		int tmp = left;

		while (left <= center && mid <= right) {
			// 从两个数组中取出最小的放入中间数组
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}

		// 剩余部分依次放入中间数组
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		// 将中间数组中的内容复制回原数组
		while (tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}

		System.out.println(Arrays.toString(data));

	}

	@Test
	public void radixSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 101, 56, 17, 18,
						23, 34, 15, 35, 25, 53, 51 };

		// 首先确定排序的趟数; 找到最大的数
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		// 判断最大数max有几位;
		int times = 0;
		while (max > 0) {
			max /= 10;
			times++;
		}
		
		// 建立10个队列;
		List<ArrayList<Integer>> queue = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> queue1 = new ArrayList<Integer>();
			queue.add(queue1);
		}

		// 进行time次分配和收集
		for (int i = 0; i < times; i++) {
			
			// 分配;
			for (int j = 0; j < a.length; j++) {
				// 得到数字的第time+1位数;
				int x = a[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);

				ArrayList<Integer> queue2 = queue.get(x);
				queue2.add(a[j]);
				queue.set(x, queue2);
			}
			
			int count = 0;
			// 收集;
			for (int k = 0; k < 10; k++) {
				while (queue.get(k).size() > 0) {
					ArrayList<Integer> queue3 = queue.get(k);
					a[count] = queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	@Test
	@Ignore
	public void tt() {
		double a = 5.0 / 2;
		System.out.println(a);
		System.out.println(Math.ceil(a));

		int time = 0;
		int max = 132;
		while (max > 0) {
			max /= 10;
			time++;
		}
		System.out.println(max);
		System.out.println(time);

	}
}
