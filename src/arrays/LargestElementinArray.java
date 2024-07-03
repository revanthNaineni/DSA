package arrays;

public class LargestElementinArray {

	public static void main(String[] args) {
		int arr[]= {6,9,-1,7,22,-99,32};
		System.out.println(largestElement(arr, arr.length));

	}
	static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

}
