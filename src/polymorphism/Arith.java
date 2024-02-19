package polymorphism;
//Constructor overloading
public class Arith  extends SimpleMath{
	int a=0,b=0;
	String name;
		
	public Arith(int a,int b) {
		super(a, b);// new SimpleMath(34, 66);
		this.a=a;
		this.b=b;
	}
//	public Arith(String name) {
//		this.name=name;
//	}
//	public Arith(float percentage) {
//		
//	}
	//Method overloading
	public int add(int a,int b) {
		return a+b;
	}
	public int add() {
	return this.a + this.b;	
	}
	

}
