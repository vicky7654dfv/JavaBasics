package task1;

public class CircularDLLNode {
	    int data;
	    CircularDLLNode prev, next;

	    public CircularDLLNode() {
	        data = 0;
	        prev = null;
	        next = null;
	    }

	    public CircularDLLNode(int data, CircularDLLNode prev, CircularDLLNode next) {
	        this.data = data;
	        this.prev = prev;
	        this.next = next;
	    }

	    public void setData(int data) {
	        this.data = data;
	    }

	    public void setPrev(CircularDLLNode prev) {
	        this.prev = prev;
	    }

	    public void setNext(CircularDLLNode next) {
	        this.next = next;
	    }

	    public int getData() {
	        return data;
	    }

	    public CircularDLLNode getPrev() {
	        return prev;
	    }

	    public CircularDLLNode getNext() {
	        return next;
	    }
}
