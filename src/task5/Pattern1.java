package task5;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		int[] arr=new int[5];
		patt(i,j,arr);
	}
	public static int[] patt(int i,int j,int[] arr)
	{
		if(i<=arr.length) 
		{
			if(j<=i) 
			{
				if(i==j+1)
				System.out.print(i);
				return patt(i,++j,arr);
			}
			System.out.println();
			return patt(++i,0,arr);
		}
		return arr;
	}
}