package findDup;
import java.util.*;
import java.util.ArrayList;
import madeClasses.*;

public class findDup {
	    void duplicate(int[] arr){
	    	ArrayList<Integer> arrout=new ArrayList<Integer>();
	    	int count=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						if(i==j) {
							continue;
						}
						count++;
						if(count==1) {
							if(arrout.contains(arr[j])) {
								count=0;
								break;
							}
							else {
								arrout.add(arr[i]);
								count=0;
								break;
							}
						}
					}
				}
			}
			new print(arrout);
		}
	
}

class testfindDup {

	public static void main(String[] args) {
		int[] arrin= {2,3,8,9,6,2};
		findDup duplicate=new findDup();
		duplicate.duplicate(arrin);
	}

}
