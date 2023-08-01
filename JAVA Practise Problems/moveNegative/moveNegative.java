package moveNegative;

public class moveNegative{
	
	void move1(int[] arr) {
		int len=arr.length;
		int[] arrout=new int[len];
		int pointerforneg=0;
		int pointerforpos=len-1;
		for(int i=0;i<len;i++) {
			if(arr[i]<0) {
				arrout[pointerforneg]=arr[i];
				pointerforneg++;
			}
			else {
				arrout[pointerforpos]=arr[i];
				pointerforpos--;
			}
		}
		
		for(int toPrint:arrout) {
			System.out.print(toPrint+" ");
		}
		System.out.println("");
	}

	void move2(int[] arr) {
		int len=arr.length;
		int pointerforneg=0;
		int temp=0;
		for(int i=0;i<len;i++) {
			if(arr[i]<0) {
				temp=arr[i];
				arr[i]=arr[pointerforneg];
				arr[pointerforneg]=temp;
				pointerforneg++;
			}
		}
		for(int toPrint : arr) {
			System.out.print(toPrint+" ");
		}
	}

}

class testmoveNegative {

	public static void main(String[] args) {
		int[] arrin= {1,2,-3,-5,6,-7};
		moveNegative move = new moveNegative();
		move.move1(arrin);
		move.move2(arrin);
	}

}
