package arrays;

public class SecondLargestElementOptimalApproach {

	public static void main(String[] args) {
		int arr[]= {99,34,6,9,-1,7,22,-99,32};
		System.out.println(secondLargestElement(arr, arr.length));

	}
	static int secondLargestElement(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        int secondMax=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
            	secondMax=max;
                max=arr[i];
                
            }else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

}
