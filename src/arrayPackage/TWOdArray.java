package arrayPackage;

import java.util.Scanner;

public class TWOdArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the elements:");
		int[][] arr=new int[5][3];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}

		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
