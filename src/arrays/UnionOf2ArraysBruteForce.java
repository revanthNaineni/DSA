package arrays;

import java.util.TreeSet;

public class UnionOf2ArraysBruteForce {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
		Integer[] integers = findUnion(arr1, arr2);

		for (Integer integer : integers) {
			System.out.println(integer);
		}

	}

	public static Integer[] findUnion(int arr1[], int arr2[]) {

		TreeSet<Integer> set = new TreeSet<Integer>();

		for (Integer integer : arr1) {
			set.add(integer);
		}

		for (Integer integer : arr2) {
			set.add(integer);
		}

		Integer[] array = set.stream().toArray(Integer[]::new);
		return array;

	}

}
