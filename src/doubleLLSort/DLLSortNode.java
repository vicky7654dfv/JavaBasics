package doubleLLSort;

public class DLLSortNode<T> {
    T value;
    DLLSortNode<T> prev, next;

    public DLLSortNode(T data) {
        this.value = data;
    }

    public void setValue(T data) {
        this.value = data;
    }

    public void setPrev(DLLSortNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(DLLSortNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public DLLSortNode<T> getPrev() {
        return prev;
    }

    public DLLSortNode<T> getNext() {
        return next;
    }


}
