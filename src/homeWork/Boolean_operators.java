package homeWork;

import java.util.Scanner;

public class Boolean_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.print("Enter a:");
		 boolean a = s.nextBoolean();
		 System.out.print("Enter b:");
		 boolean b = s.nextBoolean();
		 boolean c = a | b;
		 boolean d = a & b;
		 boolean e = a ^ b;
		 boolean f = (!a & b) | (a & !b);
		 boolean g = !a;
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 System.out.println("a|b = " + c);
		 System.out.println("a&b = " + d);
		 System.out.println("a^b = " + e);
		 System.out.println("!a&b|a&!b = " + f);
		 System.out.println("!a = " + g);

	}

}
