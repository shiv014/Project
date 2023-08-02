package countsumpairs;

public class countsumpairs {

	public static void main(String[] args) {
		int[] arrin= {1, 1, 1, 1};
		int k=2;
		int count=0;
		for(int i=0;i<arrin.length;i++) {
			for(int j=0;j<arrin.length;j++) {
				if(i==j) {
					continue;
				}
				if(arrin[i]+arrin[j]==k) {
					count++;
				}
			}
		}
		System.out.println(Math.abs(count/2));
	}

}
