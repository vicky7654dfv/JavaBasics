package circularLinkedList;

import linkedList.SingleLLNode;

public class CircularLinkedList {
	CircularLLNode head=null;
	CircularLLNode tail=null;
	
	public void insert(int value) {
		CircularLLNode circularLLNode=new CircularLLNode();
		circularLLNode.setValue(value);
		
		if(head==null)
		{
			circularLLNode.next=circularLLNode;
			head=circularLLNode;
			tail=circularLLNode;
		}
		else {
			circularLLNode.next=head;
			tail.next=circularLLNode;
			tail=circularLLNode;
		}
	}
	
	public void print() {
		CircularLLNode currentVal=head;
		if(currentVal!=null) {
			do {
				System.out.println(currentVal.value);
				currentVal=currentVal.getNext();
			}
			while(currentVal!=head);
		}

		else {
			System.out.println("List is empty");
		}
}
}