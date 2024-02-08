package arrayPackage;


import java.util.Scanner;

public class MaxMinNumberArray {

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
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<num;i++)
		{
			if(arr[i]>=max)
				max=arr[i];
			if(arr[i]<=min)
				min=arr[i];
		}
		System.out.println("Maximum number is:"+ " "+max + " and the minimum number is "+min);
	}}

