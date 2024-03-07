package stackWith;


public class StackLogic<T> {
	StackNode<T> first=null;
	StackNode<T> last=null;
	
	public void push(int value)
	{
		StackNode<T> ob=new StackNode<T>(value);
		
		if(first==null)
		{
			first=ob;
			last=ob;
		}
		else
		{
			last.next=ob;
			last=ob;
		}
	}
	public void print()
	{
		StackNode temp=first;
		if(first!=null)
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
	
	public int peek() {
		if(last!=null)
			return last.value;
		return null;
	}
	 public int size() {
		 return length++;
	 }
	
	
	public void pop()
	{
		if(first == last)
		{
			first=null;
			last=null;
			length=0;
		}
		else if(first!= null)
		{
			StackNode<T> current = first;
			while(current!=null)
			{
				if(current.next==last)
				{
					current.next=null;
					last=current;
					length--;
					break;
				}
				current=current.next;
			}
			
		}
	}


}
