package juggleLetters;
import java.util.*;

public class juggleLetters {
	public static void main(String args[]) {
		
		int count=0;
		// Taking input from User
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] strin=new String[n];
		for(int i=0;i<n;i++) {
			strin[i]=sc.next(); 
		}
		sc.close();
		String strout="";
		
		// merging the string to one string
		for(String s:strin) {
			strout=strout.concat(s);
		}
		
		//converting the string to char array
		
		char[] stroutarr=strout.toCharArray();
		int len=stroutarr.length;
		
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
}
