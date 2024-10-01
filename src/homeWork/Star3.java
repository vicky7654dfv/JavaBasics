package homeWork;

public class Star3 {

    public static void main(String[] args) {
        int rows = 5;  // Number of rows
        
        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop for printing leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Loop for printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
