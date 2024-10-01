package heap;

import java.util.ArrayList;

public class HeapMain {

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        HeapLogic heapLogic = new HeapLogic(heap);

        heap.add(22);
        heap.add(56);
        heap.add(21);
        heap.add(14);
        heap.add(16);
        heap.add(18);
        heap.add(12);
        heap.add(7);
        heap.add(13);
        heap.add(23);
        heap.add(36);
        heap.add(5);
        heap.add(9);
        heap.add(4);
        heap.add(2);
        heap.add(57);
        heap.add(24);

        for (int i = 0; i < heapLogic.heap.size(); i++) {
            System.out.println(i + ": " + heapLogic.heap.get(i));
        }
        System.out.println("***********************");
    }
}
