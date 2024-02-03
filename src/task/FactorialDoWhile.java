package task;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int result=1;
		int i=1;
		do
		{   
			result=result*i;
			i++;
		}
		while(i<=num);
		System.out.println(result);

	}

}
