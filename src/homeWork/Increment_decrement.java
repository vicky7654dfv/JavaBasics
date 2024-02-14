package homeWork;

import java.util.Scanner;

public class Increment_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter any integer a:");
		 a = s.nextInt();
		 b = ++a;
		 System.out.println("Result after Pre Increment a:"+a);
		 System.out.println("Result after Pre Increment b:"+b);
		 c = a++;
		 System.out.println("Result after Pre Increment a:"+a);
		 System.out.println("Result after Post Increment c:"+c);
		 d = --a;
		 System.out.println("Result after Pre Increment a:"+a);
		 System.out.println("Result after Pre Decrement d:"+d);
		 e = a--;
		 System.out.println("Result after Pre Increment a:"+a);
		 System.out.println("Result after Post Decrement e:"+e);

	}

}
