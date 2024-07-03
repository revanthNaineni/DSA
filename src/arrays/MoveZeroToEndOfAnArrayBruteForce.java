package arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndOfAnArrayBruteForce {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 0, 6, 4, 0, 0, 9, 0, -1 };
		int[] zerosToEnd = moveZerosToEnd(arr);
		for (int i : zerosToEnd) {
			System.out.println(i);
		}

	}

	public static int[] moveZerosToEnd(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			if (i != 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		for (int i = 0; i < arr.length; i++) {
			if (i >= list.size()) {
				arr[i] = 0;
			} else {
				arr[i] = list.get(i);
			}
		}
		return arr;

	}

}
