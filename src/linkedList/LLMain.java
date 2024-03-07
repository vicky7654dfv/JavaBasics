package linkedList;

public class LLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll=new SingleLinkedList();
		sll.insert(5);
		sll.insert(3);
		sll.insert(6);
		sll.insert(12,2);
		sll.insert(9);
		sll.insert(4);
		sll.insert(2);
		sll.print();
	}
}