package arrayPackage;

import java.util.Scanner;

public class Array2DRev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int n=5;
		int m=3;
		int[][] arr= {{2,3,5},{9,6,2},{2,9,4},{7,9,2},{8,2,6}};
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}




	}

}
