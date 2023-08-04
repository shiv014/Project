package arrangeAlter;

public class ArrangeAlter {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4};
		int[] arrout=new int[arr.length];
        int temp=1;
        int temp2=2;
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
			if(i+temp>arr.length) {
				arrout[arr.length-temp2]=arr[i];
				temp2=temp+2;
			}
			}
			
			if(arr[i]>0) {
				arrout[i+temp]=arr[i];
				temp++;
			}
		}
	}

}
