package circularDouble;

import circularLinkedList.CircularLLNode;

public class CircularDoubleLinkedList {
	CircularLLNode head=null;
	CircularLLNode tail=null;
	
	public void insert(int value) {
		CircularDLLNode circularLLNode=new CircularDLLNode();
		circularLLNode.setValue(value);
		
		if(head==null)
		{
			circularDLLNode.next=circularDLLNode;
			head=circularDLLNode;
			tail=circularDLLNode;
		}
		else {
			circularDLLNode.next=head;
			tail.next=circularDLLNode;
			tail=circularDLLNode;
		}
	}
	
	public void print() {
		CircularDLLNode currentVal=head;
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
