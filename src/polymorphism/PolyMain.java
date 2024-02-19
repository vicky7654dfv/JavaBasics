package polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Arith arith=new Arith(34,66);
		
		
		SimpleMath simpleMath = new SimpleMath(6, 9);
		
		System.out.println(simpleMath.add());
		System.out.println(arith.div());
		
	}

}
