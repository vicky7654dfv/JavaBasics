package queue;

import stack.StackWork;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWork ob1=new QueueWork();
		System.out.println("Before");
		ob1.enqueue(10);
		ob1.enqueue(20);
		ob1.enqueue(30);
		ob1.print();
		System.out.println("After");
		ob1.dequeue();
		ob1.print();
	}

}
