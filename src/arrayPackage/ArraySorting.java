package arrayPackage;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int num=s.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
		
			if(arr[i]>arr[j])
			{
				int max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
			}
			
		}}
		for(int i=0;i<num;i++) {                               
		System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[i]<arr[j])
				{
					int min=arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
		
			
		}for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
