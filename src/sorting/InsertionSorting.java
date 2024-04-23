package sorting;

import java.util.*;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements one by one:");
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		
		int key,temp;
		
		for(int step=1;step<n;step++) 
		{
			key=step;
			for(int i=step;i>0;i--)
			{
				if(arr[key]<arr[i-1])
				{
					temp=arr[key];
					arr[key]=arr[i-1];
					arr[i-1]=temp;
					key--;
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);
	}

}