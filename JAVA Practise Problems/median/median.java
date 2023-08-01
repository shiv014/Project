package median;
import java.util.Arrays;


// This program finds the median of 2 sorted arrays of same or different size.
public class median {

	public static void main(String[] args) {
		int[] arrin= {1,12,15,26,38};
		int[] arrin1= {2,13,17,30,45};
		int[] mergedArr=new int[(arrin.length)+arrin1.length];
		System.arraycopy(arrin, 0, mergedArr, 0, arrin.length);
		System.arraycopy(arrin1, 0, mergedArr, arrin.length, arrin1.length);
		Arrays.sort(mergedArr);
		if(mergedArr.length%2==0) {
			int med1=mergedArr[mergedArr.length/2];
			int med2=mergedArr[(mergedArr.length/2)-1];
			System.out.println((med1+med2)/2);
		}
		else {
			System.out.println(mergedArr[mergedArr.length/2]);
		}

	}

}
