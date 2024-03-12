package json;

public class Dll {
	DllPerson head;
	DllPerson tail;
	
	public void insert(K name)
	{
		DLLPerson<K> person=new DllPerson<K>(name);
		if(head==null)
		{
			head=person;
			tail=person;
		}
		else
		{
			person.connectPrev=tail;
			tail.connectNext=person;
			tail=person;
		}
	}
	public void print()
	{
		DllPerson currentPerson=head;
		while(curretPerson!=null)
		{
			System.out.println(currentPerson.name);
			currentPerson=currentPerson.connectNext;
		}
	}

}
