package task;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int num=ob.nextInt();
		int result = 0;
		for(int i=1;i<num;i++)
		{
			result=num*i;
		}
System.out.println(result);
	}

}
