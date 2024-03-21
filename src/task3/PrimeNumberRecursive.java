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
		int x=0,y=0;
		System.out.println();
		int[][] arr=new int[5][5];
		shape(x,y,arr);
		
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
	public static int[][] shape(int x,int y,int[][] arr)
	{
		if(x<arr.length)
		{
			if(y<arr[x].length)
			{
		      if((x==y && x<= arr.length/2) || (x==arr.length/2 && y>=arr[x].length/2) || (x+y == arr[x].length-1 && x>=arr.length/2))
		        	System.out.print("* ");
	  	      else
                  System.out.print("  ");
		      return shape(x,++y,arr);
			}
			System.out.println();
			return shape(++x,0,arr);
		}
		return arr;
	}
}