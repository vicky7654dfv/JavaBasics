package homeWork;

import java.util.Scanner;

public class Increment_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m = 0, a;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter any number:");
		 n = s.nextInt();
		 while(n > 0)
		 {
		 a = n % 10;
		 a++;
		 m = m * 10 + a;
		 n = n / 10;
		 }
		 n = m;
		 m = 0;
		 while(n > 0)
		 {
		 a = n % 10;
		 m = m * 10 + a;
		 n = n / 10;
		 }
		 System.out.println("Result:"+m);

	}

}
