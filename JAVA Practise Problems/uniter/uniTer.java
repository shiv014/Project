package uniter;
import java.util.*;

class uniTer{
	void union(int[] arr1, int[] arr2)
	{
		ArrayList<Integer> arrUni=new ArrayList<Integer>(); 
		ArrayList<Integer> arrIntsc=new ArrayList<>();
		for(int n : arr1){
			arrUni.add(n);
		}
		
		for (int n : arr2) {
			if(arrUni.contains(n)) {
				arrIntsc.add(n);
				continue;
			}
			else {
				arrUni.add(n);
			}
		}
		
		System.out.println("Union of 2 arrays are : ");
		for(int toPrint : arrUni) {
		 System.out.print(toPrint+" ");
		}
		
		System.out.println("\nIntersections of 2 arrays are : ");
		for(int toPrint : arrIntsc) {
			 System.out.print(toPrint+" ");
		}
	}
}
 
class testuniTer{
	public static void main(String args[]){
	int[] arrin1={1,2,3,4,5};
	int[] arrin2={2,5,6,7,8};
	uniTer union=new uniTer();
	union.union(arrin1,arrin2);
	}
}
