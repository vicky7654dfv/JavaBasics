package polymorphism;

public class SimpleMath {

	int a=0,b=0;
	SimpleMath(int a,int b) {
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
