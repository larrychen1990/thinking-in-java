package chpt6;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
	public static void bubbleSort(Integer[] datas) {
		int datasLength = datas.length;
		for (int i = 0; i < datasLength - 1; i++) {
			for (int j = 0; j < datasLength - 1 - i; j++) {
				if (datas[j] < datas[j + 1]) {
					Integer temp = datas[j + 1];
					datas[j + 1] = datas[j];
					datas[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Integer[] a={1,4,3,5,5,9,0,-1,6,2};
		bubbleSort(a);
		for(Integer aa:a){
			System.out.print(aa+" ");
		}
	}
	
}
