package parseValue;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=23;
		Integer b=12;
		Double c=12.7;
		Double d=11.2;
		
		System.out.println("Abs : "+Math.abs(c));
		System.out.println("Abs : "+Math.abs(a));
		System.out.println("ceil : "+Math.ceil(c));
		System.out.println("floor : "+Math.floor(c));
		System.out.println("round : "+Math.round(c));
		System.out.println("round : "+Math.round(d));
		System.out.println("sqrt : "+Math.sqrt(a));
		System.out.println("max : "+Math.max(c, a));
		System.out.println("min : "+Math.min(a, d));
		System.out.println("random : "+Math.random());
		System.out.println("Power of : "+Math.pow(21, 3)); 
		System.out.println("expo : "+Math.exp(d));
	}

}
