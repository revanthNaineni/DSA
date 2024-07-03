package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyUsingHashmap {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 5, 5 };

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count frequency of each element
		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		System.out.println(frequencyMap);
		// Print frequency of each element
		System.out.println("Element Frequency:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
