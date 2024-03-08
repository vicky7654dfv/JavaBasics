package circularDouble;

import circularLinkedList.CircularLLNode;

public class CircularDLLNode {
	int value;
	CircularDLLNode next=null;
	
	public int getValue() {
	return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	public CircularDLLNode getNext() {
		return next;
	}
	public void setNext(CircularDLLNode next) {
		this.next=next;
	}

}
