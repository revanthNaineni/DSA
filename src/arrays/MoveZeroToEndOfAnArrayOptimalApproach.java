package arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndOfAnArrayOptimalApproach {

	public static void main(String[] args) {


		int arr[] = { 1, 3, 0, 6, 4, 0,0, 0, 9, 0, -1 };
		int[] zerosToEnd = moveZerosToEnd(arr);
		for (int i : zerosToEnd) {
			System.out.println(i);
		}

	}
	
	public static int[] moveZerosToEnd(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int j=i+1;
			if(arr[i]==0) {
				while(arr[j]==0 && j<arr.length-1) {
					j++;
				}
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		return arr;
	}

}
