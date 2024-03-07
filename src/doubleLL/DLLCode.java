package doubleLL;

import doubleLinkedList.DLLPerson;

public class DLLCode {
	DLLNode head=null;
	DLLNode tail=null;
	
	public void insert(int value)
	{
		DLLNode node=new DLLNode();
		node.setValue(value);
		
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
	}
	public void print() {
		DLLNode currentValue=head;
		while(currentValue!=null) {
			System.out.println(currentValue.getValue());
			currentValue=currentValue.getNext();
		}	
	}
}