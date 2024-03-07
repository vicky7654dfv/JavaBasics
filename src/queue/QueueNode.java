package queue;

import stack.StackNode;

public class QueueNode {
	int value;
	QueueNode next;
	
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value= value;
	}
	public QueueNode getNext()
	{
		return next;
	}
	public void setNext(QueueNode next)
	{
		this.next= next;
	}



}
