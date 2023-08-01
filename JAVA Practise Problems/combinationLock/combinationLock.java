package combinationLock;
import java.util.*;


public class combinationLock {

	public static void main(String[] args) {
		

		int countRev=0;
		int countFor=0;
		int temp=0;
		int totalStep=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] lockarr=new int[n];
		for(int i=0;i<n;i++) {
			lockarr[i]=sc.nextInt();
		}
		
		int[] unlockarr=new int[n];
		for(int i=0;i<n;i++) {
			unlockarr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			if(lockarr[i]==unlockarr[i]) {
				continue;
			}
           // this while will count in rev orde (like 8, 7,5)
			temp=lockarr[i];
			while(temp < unlockarr[i] || temp > unlockarr[i]) {
				temp=temp-1;
				countRev++;
				if(temp==0) {
					temp=10;
				}
			}
			
			
			// this while will count in forward order (like 8, 9,0)
			temp=lockarr[i];
			while(temp < unlockarr[i] || temp > unlockarr[i]) {
				temp=temp+1;
				countFor++;
				if(temp==10) {
					temp=0;
				}
			}
			
			totalStep=totalStep+Math.min(countRev, countFor);
			countRev=0;
			countFor=0;
		}
		
		System.out.println(totalStep);
		
	}

}
