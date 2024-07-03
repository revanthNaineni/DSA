package arrays;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 6, 9, -1, 7, 22, 99, 32,46,44 };
		
		for (int i = 0; i < arr.length-1; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
