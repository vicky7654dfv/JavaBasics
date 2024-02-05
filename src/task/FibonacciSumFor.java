package task;

import java.util.Scanner;

public class FibonacciSumFor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=5;
		int[] input=new int[5];
		input[0]=1;
		input[1]=1;
		int total=input[0]+input[1];
		for(int i=2;i<num;i++)
		{
			input[i]=input[(i-1)+(i-2)];
			total=total+input[i];
		}
		System.out.println(total);
       }

}