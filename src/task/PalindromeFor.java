package task;

import java.util.Scanner;

public class PalindromeFor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=s.next();
		String str1=str;
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		System.out.println(str2+" "+str1);
		if(str2.equals(str1))
		{
			System.out.println("Given string is a Palindrome");
		}
		else
		{
			System.out.println("Given string is not a Palindrome");
		}	    
	}
}