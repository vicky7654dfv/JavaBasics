package task5;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int square = num * num;
	    while (num > 0)
	    {
	      if (num % 10 != square % 10)
	        System.out.println("Not a Automorphic number");
	      num = num/10;
	      square = square/10;
	    }
        System.out.println("Automorphic number");
	}
}