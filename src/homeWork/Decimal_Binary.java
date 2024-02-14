package homeWork;

import java.util.Scanner;

public class Decimal_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		 String x = "";
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the Decimal Number:");
		 n = s.nextInt();
		 while(n > 0)
		 {
		 int a = n % 2;
		 x = a + x;
		 n = n / 2;
		 }
		 System.out.println(x);

	}

}
