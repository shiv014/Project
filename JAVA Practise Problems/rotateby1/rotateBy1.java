package rotateby1;
import madeClasses.*;

public class rotateBy1 {
	
	void rotate(int[] arr) {
		int len=arr.length;
		int temp=arr[len-1];
		arr[len-1]=arr[0];
		arr[0]=temp;
		
		new print(arr);
	}
	
}

class testrotateBy1 {
	
	public static void main(String args[]) {
		int[] arrin= {1,2,3,4,5};
		rotateBy1 rotate=new rotateBy1();
		rotate.rotate(arrin);
	}

}
