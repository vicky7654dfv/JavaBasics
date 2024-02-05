package task;

import java.util.Scanner;

public class PalindromeWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.next();
		String str1 =str;
		String str2="";
		int i=str.length()-1;
		while(i>=0)
		{
			str2+=str1.charAt(i);
			i--;
		}
		System.out.println(str1+ " "+ str2);
		if(str1.equals(str2))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}
}
