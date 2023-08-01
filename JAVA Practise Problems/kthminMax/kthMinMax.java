package kthminMax;
import java.util.*;
public class kthMinMax {
	
	void min(Integer[] arr, int kth) {
		Arrays.sort(arr);
		System.out.println(kth+" smallest element is : "+arr[kth-1]);
	}
	
	void max(Integer[] arr, int kth) {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(kth+" largest element is : "+arr[kth-1]);
	}
	
}

class testkthMinMax{
	public static void main(String args[]) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element");
		n=sc.nextInt();
		Integer[] arrin=new Integer[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arrin[i]=sc.nextInt();
		}
		System.out.println("Which smallest element you want to find");
		int mink=sc.nextInt();
		
		System.out.println("Which largest element you want to find");
		int maxk=sc.nextInt();
		sc.close();
		kthMinMax min=new kthMinMax();
		min.min(arrin, mink);
		
		kthMinMax max=new kthMinMax();
		max.max(arrin, maxk);
		
		
	}
}
