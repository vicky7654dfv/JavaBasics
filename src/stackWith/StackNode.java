package stackWith;

public class StackNode<T> {
    public T value;
    public StackNode<T> next;  // Use StackNode<T> for generic type safety

    public StackNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public StackNode<T> getNext() {
        return next;
    }
}
