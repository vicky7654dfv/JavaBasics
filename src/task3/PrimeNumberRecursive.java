package task3;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int i=2;
		Boolean p = prime(num,i);
		if(p)
			System.out.println("It's a prime number");
		else
			System.out.println("It's not a prime number");
		
		
	}
	
	public static Boolean prime(int num,int i) {
		
			if(num<=1)
				return false;
			 if(i<num)
			 {
				  if(num%i == 0) {
					return false;
				  }
				  else
					 return prime(num,i+1);
			}
			

		return true;
  }
}