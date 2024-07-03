package arrays;

public class RightRotatedArrayByNPositions {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] leftRotate = leftRotate(arr, 26);
		for (int i : leftRotate) {
			System.out.println(i);
		}

	}

	public static int[] leftRotate(int[] arr, int noOfpositions) {

		int count = 1;
		if (noOfpositions % arr.length == 0) {
			return arr;
		} else {
			while (count <= (noOfpositions % arr.length)) {
				int temp = arr[arr.length - 1];
				for (int i = arr.length - 1; i >= 1; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
				count++;
			}
			return arr;
		}
	}
}
