package arrays;

import java.util.Arrays;

public class SecondLargestElementBruteForce {

	public static void main(String[] args) {
		int arr[]= {6,9,-1,7,22,-99,32,32};
		System.out.println(secondLargestElement(arr, arr.length));

	}
	static int secondLargestElement(int[] arr, int n) {
        Arrays.sort(arr);
        int max=arr[n-1];
        int secondMax=0;
        for (int i = n-2; i >= 0; i--) {
        	if(arr[i]!=max) {
        		secondMax=arr[n-2];
        		break;
        	}
        }
		return secondMax;	
		}
}
