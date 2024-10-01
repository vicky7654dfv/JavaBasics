package stack;

public class StackMain {

    public static void main(String[] args) {
        StackWork stack = new StackWork();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the current stack
        System.out.println("Current Stack:");
        stack.print();

        // Pop an element from the stack
        stack.pop();

        // Print the stack after popping
        System.out.println("Stack after pop:");
        stack.print();

        // Print the current size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
