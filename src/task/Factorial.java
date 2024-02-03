package task;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=ob.nextInt();
		int result = 1;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
System.out.println(result);
	}

}
