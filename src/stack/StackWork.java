package stack;

import queue.QueueNode;
import stackWith.StackNode;

public class StackWork {
	StackNode head=null;
	StackNode tail=null;
	int length=0;
	
	public void push(int value)
	{
		StackNode ob2=new StackNode();
		ob2.setValue(value);
		
		if(head==null)
		{
			head=ob2;
			tail=ob2;
		}
		else
		{
			tail.setNext(ob2);
			tail=ob2;
		}
		length++;
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
		if(head == tail)
		{
			head=null;
			tail=null;
			length=0;
		}
		else if(head!= null)
		{
			StackNode current = head;
			while(current!=null)
			{
				if(current.next==tail)
				{
					current.next=null;
					tail=current;
					length--;
					break;
				}
				current=current.next;
			}
			
		}
	}
}
