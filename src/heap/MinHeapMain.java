package heap;

public class MinHeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The Min Heap is ");
        
        // Creating object of class in main() method
        HeapCode minHeap = new HeapCode(15);
 
        // Inserting element to minHeap
        // using insert() method
 
        // Custom input entries
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
 
        // Print all elements of the heap
        minHeap.print();
 
        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Min val is "
                           + minHeap.remove());

	}

}
