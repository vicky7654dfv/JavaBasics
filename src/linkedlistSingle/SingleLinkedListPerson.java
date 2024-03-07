package linkedlistSingle;

public class SingleLinkedListPerson {
	SingleLLPerson head=null;
	SingleLLPerson tail=null;
	public void insert(String name) {
		SingleLLPerson person = new SingleLLPerson(name);
		if(head==null) {
			head=person;
			tail=person;
		}
		else {
			tail.connectNext=person;
			tail=person;
		}
	}
	public void print() {
		SingleLLPerson currentPerson = head;
		while(currentPerson !=null) {
			System.out.println(currentPerson.name);
			currentPerson=currentPerson.connectNext;
		}
	}

}
