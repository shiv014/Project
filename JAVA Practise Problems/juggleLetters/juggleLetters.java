package juggleLetters;
import java.util.*;

public class juggleLetters {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int test=sc.nextInt();
		
		while(test>0) {
		test--;
		int count=0;
		// Taking input from User
		
		int n=sc.nextInt();
		String[] strin=new String[n];
		for(int i=0;i<n;i++) {
			strin[i]=sc.next(); 
		}
		
		String strout="";
		
		// merging the string to one string
		for(String s:strin) {
			strout=strout.concat(s);
		}
		
		//converting the string to char array
		
		char[] stroutarr=strout.toCharArray();

		//counting each element repeatation and checking
		// if count is equal to 0;
		/*
		 * logic here is that is that the each char must be equal
		 * to number of inputed string. If count is not equal
		 * that means letters can be juggled to form a common string
		 */
        for(int i=0;i<stroutarr.length;i++) {
        	for(int j=0;j<stroutarr.length;j++) {
        		if(stroutarr[i]==stroutarr[j]) {
        			count++;
        		}
        	}
        	if(count%n == 0) {
        		count=0;
        	}
        	else {
        		System.out.println("No");
        		break;
        	}
        }
        
        if(count==0) {
        	System.out.println("Yes");
        }
		
	 }
		sc.close();
	}
}
