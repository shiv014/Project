package candybags;

import java.util.Scanner;

public class Candybags {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int brothers=sc.nextInt();
		sc.close();
		int totalBags=brothers*brothers;
		int candy=1;
		int[] totalbagsarr=new int[totalBags];
		for(int i=0;i<totalBags;i++) {
			totalbagsarr[i]=candy;
			candy++;
		}
		int toput=0;
		
		int[][] output=new int[brothers][brothers];
		
		int tostorecolumn=0;
		
		for(int j=0;j<brothers/2;j++) {
			for(int i=0;i<brothers;i++) {
				output[i][j]=totalbagsarr[toput];
				toput++;
			}
			tostorecolumn=j+1;
		}
		
		for(int j=tostorecolumn;j<brothers;j++) {
			for(int i=0;i<brothers;i++) {
				output[brothers-i-1][j]=totalbagsarr[toput];
				toput++;
			}
		}
		
		
		for (int i = 0; i < brothers; i++) {
            for (int j = 0; j < brothers; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
	}

}
