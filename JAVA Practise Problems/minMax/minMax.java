package minMax;
import java.util.Scanner;

public class minMax {
	
	void minOf(int[] arr, int size) {
		int min=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
	void maxOf(int[] arr, int size) {
		int max=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}

class testminMax{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int[] arrin=new int[n];
	for(int i=0;i<n;i++) {
		arrin[i]=sc.nextInt();
	}
	sc.close();
	minMax min= new minMax();
	min.minOf(arrin,n);
	min.maxOf(arrin,n);
}
}
