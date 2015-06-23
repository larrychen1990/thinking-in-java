package chpt6;

import java.util.Arrays;
//直接插入排序
public class InsertSort {
	public static void insertSort(Integer[] datas) {
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] < datas[i - 1]) {//如果比前面的元素小
				Integer temp = datas[i];//把当前元素赋给临时变量
				int j = i - 1;
				for (; j >= 0 && datas[j] > temp; j--) {
					datas[j + 1] = datas[j];
				}
				datas[j + 1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Integer[] a={1,4,3,5,5,9,0,-1,6,2};
		insertSort(a);
		for(Integer aa:a){
			System.out.print(aa+" ");
		}
	}
}
