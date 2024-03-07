package circularLinkedList;

public class CircularLLNode {
	int value;
	CircularLLNode next=null;
	
	public int getValue() {
	return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	public CircularLLNode getNext() {
		return next;
	}
	public void setNext(CircularLLNode next) {
		this.next=next;
	}

}