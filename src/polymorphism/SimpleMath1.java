package polymorphism;

public class SimpleMath1 {
	int a=0,b=0;
	String name;
	SimpleMath1(int a,int b) {
		super(a,b);
		this.a=a;
		this.b=b;
	}
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public int div() {
		return a/b;
	}

}
