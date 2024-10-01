package stackWith;

public class StackLogic<T> {
    StackNode<T> first = null;
    StackNode<T> last = null;
    private int length = 0;  // Initialize length to track size

    // Push method should take a generic type argument, not an int
    public void push(T value) {
        StackNode<T> ob = new StackNode<>(value);

        if (first == null) {
            first = ob;
            last = ob;
        } else {
            last.next = ob;
            last = ob;
        }
        length++;  // Increment the stack size
    }

    // Print method to display the stack
    public void print() {
        StackNode<T> temp = first;
        if (first != null) {
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        } else {
            System.out.println("Empty stack");
        }
    }

    // Peek method should return a generic type, not int
    public T peek() {
        if (last != null) {
            return last.value;
        }
        return null;  // Return null if the stack is empty
    }

    // Correct the size method to return the current stack size
    public int size() {
        return length;
    }

    // Pop method to remove the last element in the stack
    public void pop() {
        if (first == last) {
            first = null;
            last = null;
            length = 0;  // Reset length when the stack is empty
        } else if (first != null) {
            StackNode<T> current = first;
            while (current != null) {
                if (current.next == last) {
                    current.next = null;
                    last = current;
                    length--;  // Decrement the size of the stack
                    break;
                }
                current = current.next;
            }
        }
    }
}
