package homeWork;

import java.util.Scanner;

public class Long_Byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a;
		 byte b;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter any long value:");
		 a = s.nextLong();
		 b = (byte) a; 
		 System.out.println("Conversion into byte:"+b);

	}

}
