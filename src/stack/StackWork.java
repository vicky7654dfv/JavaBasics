package stack;

import queue.QueueNode;

public class StackWork {
	StackNode head=null;
	StackNode tail=null;
	int size=0;
	
	public void push(int value)
	{
		size++;
		StackNode ob=new StackNode();
		ob.setValue(value);
		
		if(head==null)
		{
			head=ob;
			tail=ob;
		}
		else
		{
			tail.setNext(ob);
			tail=ob;
		}
	}
	public void print()
	{
		StackNode temp=head;
		if(head!=null)
		{
			while(temp!=null)
			{
				System.out.println(temp.getValue());
				temp=temp.getNext();
			}
		}
		else
			System.out.println("Empty stack");
	}
	public void pop()
	{
		StackNode currentValue=head;
		if(currentValue==null)
			System.out.println("Stack is empty");
		while(currentValue.next!=null) {
		if(currentValue.next!=null) 
		{
			currentValue=currentValue.getNext();
		}
		
		}
		if(currentValue.next==null)
		{
			currentValue=currentValue.getNext();
		}
	}
}
