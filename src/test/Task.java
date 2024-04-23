package test;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
//	palindrome();
//	ternarySearch();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of rotation:");
	int rot=s.nextInt();
	cylinder(rot);
	System.out.println();
	System.out.println();
	cylinder1(rot);
	System.out.println();
	System.out.println();
	cylinder2(rot);
	}
	public static void palindrome() {
		String name= "vignesh";

		boolean flag=true;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==name.charAt(name.length()-(i+1)))
				continue;
			else
			{
				flag=false;
				System.out.println("Not a Palindrome");
		        break;
			}
		}
		if(flag==true)
		System.out.println("Palindrome");
	}
	
	public static void ternarySearch()
	{
		int[] arr= {11,22,33,44,55,66,77,88};
		int left=0;
		int right=arr.length-1;
		int find=88;
		
		while(left<right) {
			int mid1= (left+(right-left)/3);
			int mid2= (right-(right-left)/3);
			
			if(find==arr[mid1]) {
				System.out.println(mid1);
			    break;
			}
			else if(find==arr[mid2]) {
				System.out.println(mid2);
				break;
			}
			else if(find<arr[mid1])
			{
				right=mid1-1;	
			}
			else if(find>arr[mid1] && find<arr[mid2])
			{
				left=mid1+1;
				right=mid2-1;
			}
			else if(find>arr[mid2])
			{
				left=mid2+1;
			}
			else
				System.out.println("Number is not in the array");
	   }
		
}
	public static void cylinder(int rot)
	{
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		System.out.println();
		
		for(int j=0;j<rot;j++) 
		{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];				
		}
		arr[0]=temp;
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		
		System.out.println();
		}
	}
	public static void cylinder1(int rot)
	{
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		System.out.println();
		
		for(int j=0;j<rot;j++) 
		{
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];				
		}
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		
		System.out.println();
		}
	}
	public static void cylinder2(int rot)
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		System.out.println();

		int[] temp=new int[arr.length];
		
		for(int j=0;j<rot;j++) 
		{
			int large=arr.length-1;
			int small=0;
			int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(flag==0)
			{
				temp[i]=arr[large];				
				flag=1;
				large--;
			}
			else
			{
				temp[i]=arr[small];
				flag=0;
				small++;
			}
		}
		for(int i=0;i<temp.length;i++)
		System.out.print(temp[i]);
		
		for(int i=0;i<temp.length;i++)
		arr[i]=temp[i];
		System.out.println();
		}
	}
}