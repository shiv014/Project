package buynsell;

public class buynsell {

	public static void main(String[] args) {
		int[] prices= {7, 8, 5, 3, 6, 4};
		int buymin=prices[0];
		int sellprofit=0;
		
		for(int i=1;i<prices.length;i++) {
			
			if(prices[i]<buymin) {
				buymin=prices[i];
			}
			else if(prices[i]-buymin>sellprofit) {
				sellprofit=prices[i]-buymin;
			}
			
			
		}
		
		System.out.println(sellprofit);

	}

}
