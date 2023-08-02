package mergesortedarr;

import java.util.Arrays;

public class mergesortedarr {
	
	public static void main(String arg[]) {
		int[] arr1= {1,3,4,5};
		int[] arr2 = {2, 4, 6, 8};
		
		int[] arr3= new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		Arrays.sort(arr3);
		
		for(int i:arr3) {
			System.out.print(i);
		}
	}

}
