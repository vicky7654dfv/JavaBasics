package doubleLL;

public class DLLNode {
	int value;
	DLLNode prev;
	DLLNode next;
	
	public DLLNode getNext() {
		return next;
	}
	public DLLNode getPrev() {
		return prev;
	}
	public int getValue() {
		return value;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
