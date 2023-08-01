package sort012;
import java.util.*;

public class sort012 {
	
	void sort(int arr[],int size) {
		int count0=0;
		int count1=0;
		int count2=0;
		int arrind;
		int[] sortarr=new int[size];
		for(int i=0;i<size;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else if (arr[i]==1) {
				count1++;
			}
			else {
				count2++;
			}
		}
		
		// to insert 0
		for(arrind=0;arrind<count0;arrind++) {
			sortarr[arrind]=0;	
		}
		
		for(int j=0;j<count1;j++) {
			sortarr[arrind]=1;
			arrind++;
		}
		
		for(int k=0;k<count2;k++) {
			sortarr[arrind]=2;
			arrind++;
		}
		
		for(int toPrint : sortarr) {
			System.out.print(toPrint+" ");
		}
		
	}
	
}

class testsort012{
	public static void main(String args[]) {
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int numofele=sc.nextInt();
		int[] arrin=new int[numofele];
		System.out.println("Enter the array elements");
		for(int i=0;i<numofele;i++) {
			arrin[i]=sc.nextInt();
		}
		sc.close();
		sort012 sort=new sort012();
		sort.sort(arrin,numofele);
	}
}
