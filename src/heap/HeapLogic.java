package heap;

public class HeapLogic {
	ArrayList<Integer> heap;
	
	public HeapLogic(ArrayList<Integer>arr) {
		this.heap=arr;
	}
	private int parentPos(int i) {
		return ((i-2)/2);
	}

	
	private int leftChild(int i) {
		return ((i*2)+1);
	}
	private int rightChild(int i) {
		return ((i*2)+1);
	}
	public void minHeap(int i) {
		int parent =i;
		int left=leftChild(i);
		int right=rightChild(i);
		
		if(left<heap.size() && heap.get(parent)>heap.get(left)) {
			parent=left;
		}
		if(left<heap.size() && heap.get(parent)>heap.get(left)) {
			parent=right;
		}
		
	}
	public void insert(int value)
	{
		heap.add(value);
		insertMaxHeap(heap.size()-1);
	}
	public void insertMaxHeap(int i)
	{
		while(i>0 && heap.get(i) > heap.get(parentPos(i)))
		{
			int parent=parentPos(i);
			int temp=heap.get(parent);
			heap.set(parent,heap.get(i));
			heap.set(i,temp);
			i=parent;
		}
	}

}
