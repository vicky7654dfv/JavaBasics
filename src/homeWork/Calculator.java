package homeWork;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		String operator = reader.next();
		double result=0;
		switch(operator)
		{
		case "+":
		result=first+second;
		break;
		case "-":
		result = first - second;
		break;
		case "*":
		result = first * second;
		break;
		case "/":
		result = first / second;
		break;
		default:
		System.out.println("Error! operator is not correct");
		break;
		}
		
		System.out.println(first+operator+second+"="+result);
		}


	}

