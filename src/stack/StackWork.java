package stack;

public class StackWork {
    StackNode head = null;
    int length = 0;

    // Push operation adds a new node to the top of the stack (head)
    public void push(int value) {
        StackNode newNode = new StackNode();
        newNode.setValue(value);
        newNode.setNext(head);  // Point new node's next to current head
        head = newNode;         // Move head to point to the new node
        length++;
    }

    // Pop operation removes the node from the top of the stack (head)
    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty, nothing to pop.");
        } else {
            System.out.println("Popped: " + head.getValue());
            head = head.getNext();  // Move head to the next node
            length--;
        }
    }

    // Print the stack from top to bottom
    public void print() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            StackNode temp = head;
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }
    }

    // Return the current length of the stack
    public int size() {
        return length;
    }
}
