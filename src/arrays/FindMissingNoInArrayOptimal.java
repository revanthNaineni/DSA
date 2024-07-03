package arrays;

//Works for only 1 missing no and array should starts from 0 or 1
public class FindMissingNoInArrayOptimal {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 7 ,8,9};
		System.out.println(missingNumber(arr));

	}

	public static int missingNumber(int[] nums) {
		
		int n=nums.length+1;

		int total = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		return total - sum;

	}

}
