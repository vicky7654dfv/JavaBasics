package queue;

import stack.StackNode;

public class QueueWork {
	QueueNode head=null;
	QueueNode tail=null;
	int size=0;
	
	public void enqueue(int value)
	{
		QueueNode ob=new QueueNode();
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
		QueueNode temp=head;
		if(head!=null)
		{
			while(temp!=null)
			{
				System.out.println(temp.getValue());
				temp=temp.getNext();
			}
		}
		else
			System.out.println("Empty queue");
	}
	public void dequeue()
	{
		if(head==null)
			System.out.println("Queue is empty");
		else  
		{
			head=head.getNext();
		}
		
	}


}
