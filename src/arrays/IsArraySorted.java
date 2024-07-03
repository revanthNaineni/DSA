package arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 6 };
		System.out.println(isArraySorted(arr));

	}

	static boolean isArraySorted(int[] arr) {
		boolean increasing = true;
		boolean decreasing = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				decreasing = false;
			} else if (arr[i] >= arr[i + 1]) {
				increasing = false;
			}
		}
		return increasing || decreasing;
	}

}
