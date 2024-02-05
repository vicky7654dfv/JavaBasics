package task;

import java.util.Scanner;

public class PalindromeDoWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.next();
		String str1=str;
		String str2="";
		int i=str.length()-1;
		do
		{
			str2+=str1.charAt(i);
			i--;
		}
		while(i>=0);
		System.out.println(str1+" "+str2);
		if(str2.equals(str1))
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("It's not a Palindrome");
		}
	}
}
