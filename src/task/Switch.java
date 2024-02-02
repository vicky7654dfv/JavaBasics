package task;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default: 
			System.out.println("Invalid input");
			break;
	}

}
}
