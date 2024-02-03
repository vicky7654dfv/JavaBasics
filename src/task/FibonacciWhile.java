package task;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int[] arr= {0,1};
		int result=0;
		int i=2;
		if(num==1)
		{
			result=0;
		}
		else if(num==2)
		{
			result=1;
		}
		else
		{
		while(i<num)
		{
			result=arr[0]+arr[1];
			arr[0]=arr[1];
			arr[1]=result;
			i++;
		}
		}
		System.out.println("Summation of Fibonacci series upto the given number is: "+result);

	}
}
