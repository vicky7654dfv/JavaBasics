package doubleLinkedList;

public class DLLPerson {
	String name;
	DLLPerson connectNext=null;
	DLLPerson connectPrev=null;
	public DLLPerson(String name) {
		this.name=name;
	}
}
