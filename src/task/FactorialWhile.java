package task;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int result=1;
		int i=1;
		while(i<=num)
		{
			result=result*i;
			i++;
		}
		System.out.println(result);

	}

}
