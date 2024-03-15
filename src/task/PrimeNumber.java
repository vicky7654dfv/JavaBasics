package task;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i != 0)
			{
				continue;
			}
			else
			{
				flag=1;
				System.out.println("It's not a prime number");
				break;
			}
		}
		if(flag==0)
		System.out.println("It's a prime number");
	}

}
