package circularDouble;

import circularLinkedList.CircularLLNode;

public class CircularDoubleLinkedList {
	CircularDLLNode head=null;
	CircularDLLNode tail=null;
	
	public void insert(int value) {
		CircularDLLNode circularDLLNode=new CircularDLLNode();
		circularDLLNode.setValue(value);
		
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
