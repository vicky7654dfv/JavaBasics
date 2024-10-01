package homeWork;

import java.util.Scanner;

public class Reverse_Recursion {

    public static void main(String[] args) {
        int n, count = 0, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = s.nextInt();
        m = n;
        
        // Count the number of digits in the input number
        while (m > 0) {
            count++;
            m = m / 10;
        }
        
        Reverse_Recursion obj = new Reverse_Recursion();
        int a = obj.reverse(n, count);
        System.out.println("Reverse: " + a);
        
        s.close();  // Close the Scanner
    }

    // Recursive function to reverse the digits of the number
    int reverse(int x, int length) {
        if (length == 1) {
            return x;
        } else {
            int b = x % 10;
            x = x / 10;
            // Use Math.pow to calculate power of 10
            return (int) ((b * Math.pow(10, length - 1)) + reverse(x, --length));
        }
    }
}
