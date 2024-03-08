package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWork ob1=new StackWork();
		ob1.push(10);
		ob1.push(20);
		ob1.push(30);
		ob1.print();
		ob1.pop();
		ob1.print();
		System.out.println(ob1.length);
	}

}
