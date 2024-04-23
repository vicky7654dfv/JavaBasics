package task5;

public class ArmstrongNumber {

	public static void arms(int n) {
		// TODO Auto-generated method stub
		String s=String.valueOf(n);
		int len=s.length();
		int temp=n,rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=Math.pow(rem,len);
			n=n/10;
		}
		if(temp==sum)
			System.out.print(temp+" ");
	}
	
	
	
	public static void main(String[] args) {
		for(int i=1;i<1000;i++) {
			arms(i);
		}

		
	}

}
