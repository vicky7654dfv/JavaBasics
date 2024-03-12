package doubleLLSort;

public class DLLSort<T> {
    DLLSortNode<T> head = null, tail = null;

    public void insert(T data) {
        DLLSortNode<T> node = new DLLSortNode<T>(data);

        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public void sort() 
    {
        DLLSortNode<T> current = null, nextCurrent = null;
        T temp;

        if (head == null) 
        {
            System.out.println("Empty");
        } else 
         {
            for (current = head; current.getNext() != null; current = current.getNext()) 
            {
                for (nextCurrent = current.getNext(); nextCurrent != null; nextCurrent = nextCurrent.getNext())
                {
                    if ((int)current.getValue() > (int)nextCurrent.getValue())
                    {
                        temp = current.getValue();
                        current.value = nextCurrent.value;
                        nextCurrent.value = temp;
                    }
                }
            }
        }
    }

    public void print() {
        DLLSortNode<T> current = head;

        if (head == null) {
            System.out.println("list is empty");
        } else {
            while(current != null) {
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }

    }

    public void reverse() {
        DLLSortNode<T> current = tail;

        while(current != null) {
            System.out.println(current.getValue());
            current = current.getPrev();
        }
    }


}
