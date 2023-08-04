package minimumswaps;

import java.util.Iterator;
import java.util.Scanner;


public class Minimumswaps {

	public static void main(String[] args) {
		int swap=0;
		int[] arrin ={10, 12, 20, 20, 5, 19, 19, 12, 1,20,1};
		int k=1;
		for(int i=0;i<arrin.length;i++) {
			if(arrin[i]<=k) {
				continue;
			}
			else {
				for(int j=0;j<arrin.length-i;j++) {
					if(arrin[arrin.length-j-1]<=k) {
						int temp=arrin[arrin.length-j-1];
						arrin[arrin.length-j-1]=arrin[i];
						arrin[i]=temp;
						swap++;
						break;
					}
				}
			}
		}
		System.out.println(swap);

	}

}

