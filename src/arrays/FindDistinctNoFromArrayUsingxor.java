package arrays;

public class FindDistinctNoFromArrayUsingxor {

	public static void main(String[] args) {
		int arr []= {1,4,1,2,4,2,6};
		System.out.println(findDistinctNo(arr));

	}

	public static int findDistinctNo(int arr []) {
		
		int xor=0;
		for (int i = 0; i < arr.length; i++) {
			xor=xor^arr[i];
		}
		
		return xor;
	}
}
