package heap;

import java.util.ArrayList;

public class HeapLogic {
    ArrayList<Integer> heap;

    public HeapLogic(ArrayList<Integer> arr) {
        this.heap = arr;
    }

    private int parentPos(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return (2 * i) + 1;
    }

    private int rightChild(int i) {
        return (2 * i) + 2;
    }

    public void minHeap(int i) {
        int parent = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(left) < heap.get(parent)) {
            parent = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(parent)) {
            parent = right;
        }

        if (parent != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);
            minHeap(parent);
        }
    }

    public void insert(int value) {
        heap.add(value);
        insertMaxHeap(heap.size() - 1);
    }

    public void insertMaxHeap(int i) {
        while (i > 0 && heap.get(i) > heap.get(parentPos(i))) {
            int parent = parentPos(i);
            int temp = heap.get(parent);
            heap.set(parent, heap.get(i));
            heap.set(i, temp);
            i = parent;
        }
    }
}
