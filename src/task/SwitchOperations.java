package task;

import java.util.Scanner;

public class SwitchOperations {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Functions ob=new Functions();
		System.out.println("Enter number 1:");
		int num1=s.nextInt();
		System.out.println("Enter number 2");
		int num2=s.nextInt();
		System.out.println("Your choices are:");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("Enter your choice:");
		String choice=s.next();
		switch(choice)
		{
		case "+":
		    ob.add(num1,num2);
		    break;
		case "-":
			ob.sub(num1,num2);
		    break;
		case "*":
			ob.mul(num1, num2);
			break;
		case "/":
			ob.div(num1, num2);
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}