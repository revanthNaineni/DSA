package arrays;

import java.util.ArrayList;
import java.util.List;
//Works for any missing nos
public class FindMissingNosInArrayBruteforce {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 11 };
		findMissingNo(arr);

	}
	
	public static void findMissingNo(int [] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]-arr[i]!=1) {
				int sub=arr[i+1]-arr[i];
				int k=1;
				while(sub>1) {
					list.add(arr[i]+k);
					k++;
					sub--;
				}
			}
		}
		
		System.out.println(list);
	}

}
