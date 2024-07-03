package arrays;

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 ,6,6};
		int[] leftRotate = leftRotate(arr);
		for (int i : leftRotate) {
			System.out.println(i);
		}

	}
	
	public static int[] leftRotate(int [] arr) {
		int temp=arr[0];
		for (int i = 1; i < arr.length; i++) {
				arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

}
