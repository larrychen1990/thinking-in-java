package chpt6;

import java.util.Arrays;

public class Ss {
	//选择排序,降序排列
	public static void descSort(Integer[] integers) {
		for (int i = 0; i < integers.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < integers.length; j++) {
				if (integers[i] < integers[j]
						&& integers[maxIndex] < integers[j]) {
					maxIndex = j;
				}
			}
			//大数和小数交换
			if (maxIndex != i) {
				Integer temp = integers[i];
				integers[i] = integers[maxIndex];
				integers[maxIndex] = temp;
			}
		}

	}
	//升序排列
	public static void ascSort(Integer[] integers){
		for(int i=0;i<integers.length-1;i++){
			for(int j=i+1;j<integers.length;j++){
				if(integers[i]>integers[j]){//如果前者大于后者就交换值
					Integer temp=integers[i];
					integers[i]=integers[j];
					integers[j]=temp;
				}
			}
		} 
		
	}
	public static void main(String[] args) {
		Integer[] a={1,4,3,5,5,9,0,-1,6,2};
//		descSort(a);
		ascSort(a);
		for(Integer aa:a){
			System.out.print(aa+" ");
		}
	}

}
