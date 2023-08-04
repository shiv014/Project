package arrPalin;

public class ArrPalin {
	
	static int reverse(int n) {
		int revalue=0;
		while(n!=0) {
			int digit=n%10;
			revalue=revalue*10+digit;
			n=n/10;
		}
		return revalue;
	}
	
	public static void main(String args[]) {
		boolean isPalin=true;
		int[] arrin= {121,111,333};
		for(int ele:arrin) {
			if(ele!=reverse(ele)) {
				System.out.println("Array is not a palindrome");
				isPalin=false;
				break;
			}
		}
		
		if(isPalin) {
			System.out.println("Array is a palindrome");
		}
	}
}
