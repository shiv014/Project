package kadenceProb;

import java.util.Scanner;

public class kadenceProb {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] arrin=new int[n];
        
        for(int i=0;i<n;i++) {
        	arrin[i]=sc.nextInt();
        }
        
        sc.close();
		int maxsum=0;
		int currsum=0;
		
		for(int i=0;i<arrin.length;i++) {
			
			currsum+=arrin[i];
			
			if(currsum>maxsum) {
				maxsum=currsum;
			}
			
			if(currsum<0) {
				currsum=0;
			}
				
			
		}
		
		System.out.println(maxsum);

	}

}
