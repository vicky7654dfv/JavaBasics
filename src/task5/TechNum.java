package task5;
import java.util.Scanner;

		public class TechNum {
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter the number: ");
		        int num = s.nextInt();
		        s.close();
		        
		        int result = (int)Math.pow(((num % 100) + (num / 100)), 2);

		        if (num == result) {
		            System.out.println(result + " is a Tech Number");
		        } else {
		            System.out.println(result + " is not a Tech Number");
		        }
		    }
		}