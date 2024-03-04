package homeWork2;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String anyString = "hello world";

        String replace = anyString.replace("world", "all");
        String[] reverse = anyString.split(" ");
        String underscore = anyString.replace(" ", "___");
        String[] SymbolsMixed = anyString.split("");

        System.out.println(replace);

        
        reverseLoop(reverse);

        System.out.println(underscore);

        loop(SymbolsMixed);
    }

    public static void reverseLoop(String[] sArr) {
        for (int i = sArr.length - 1; i >= 0; i--) {
            System.out.print(sArr[i] + " ");
        }System.out.println(" ");
    }

    public static void loop(String[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(sArr[i] + "_");
            } else {
                System.out.print(sArr[i] + "*");
            }
        }
    }
}