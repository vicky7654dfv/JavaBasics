package task;

public class HelloString {

    public static void main(String[] args) {
        String str = "Hello world All";
        String str1 = "Hello world";
        
        // Test logic method
        logic(str);
        System.out.println("****************");
        logic(str1);
        System.out.println("--------------------");

        // Test logic1 method
        logic1(str1);
        System.out.println("______________________");

        // Test logic2 method
        logic2(str1);
        System.out.println(str1.replace(' ', '_'));  // Replaces spaces with underscores
    }

    // Method to print a string in a nested pattern by words
    public static void logic(String s) {
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            for (int j = i; j < sArr.length; j++) {
                System.out.print(" " + sArr[i]);
            }
            System.out.println();
        }
    }

    // Method to replace characters (demonstration purpose)
    public static void logic1(String s) {
        String replacedStr = s.replace('w', 'A');  // Replace 'w' with 'A'
        System.out.println(replacedStr);  // Print the modified string
    }

    // Method to print the entire string for each character iteration
    public static void logic2(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s + " ");  // Print the full string each iteration
        }
        System.out.println();  // Add a newline after printing
    }
}
