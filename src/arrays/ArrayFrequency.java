package arrays;

/*Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

Similarly, the following will be the answers to the given queries:
*/

public class ArrayFrequency {

	public static void main(String[] args) {
		
		int nums []= {1, 2, 1, 3, 2};
		
		int[] frequency = countFrequency(nums.length,nums);
		/*
		 * for (int i : frequency) { System.out.println(i); }
		 */
		int query=10;
		int times=query<=nums.length?frequency[query-1]:0;
		System.out.println(query+":"+times );

	}
	
	 public static int[] countFrequency(int n, int []nums){
	        int arr[]=new int[n];

	        for (int index = 0; index < arr.length; index++) {
	            if(nums[index]<=n){
	            arr[nums[index]-1]=arr[nums[index]-1]+1;
	            }
	        }

	        return arr;
	    }

}
