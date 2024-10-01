package stackWith;

public class StackMain {
    public static void main(String[] args) {
        // Creating a stack of integers
        StackLogic<Integer> stack = new StackLogic<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack elements
        stack.print();

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Get the size of the stack
        System.out.println("Size of stack: " + stack.size());

        // Pop an element from the stack
        stack.pop();
        System.out.println("After popping:");
        stack.print();
    }
}
