package homeWork2;

public class StarMain {

	public static void main(String[] args) {
		int n=9;
		int i=0,j=0;

		int[] arr=new int[n];
		System.out.println("square + diagonal");
		int[] arr1=diagonalBox(n,arr);
		for(int k=0;k<n;k++)
		System.out.println(arr1[k]);
		
		System.out.println("square");
		int[] arr2=diagonalBox1(n,i,j,arr);
		for(int k=0;k<n;k++)
		System.out.println(arr2[k]);

		System.out.println("Shape3");
		int[] arr3=diagonalBox2(n,arr);
		for(int k=0;k<n;k++)
		System.out.println(arr3[k]);

	}
	public static int[] diagonalBox(int n,int[] arr)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 ||j==n-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();

		}
		return arr;
		
	}
	public static void diagonalBox1(int n,int i,int j,int[] arr)
	{
		if(i<n)
		{
			if(j<n)
			{
				if(i==0 || j==0 || i==n-1 ||j==n-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			diagonalBox1(n,i,++j,arr);	
		}
		System.out.println();
		diagonalBox1(n,++i,j,arr);
	}
	
	public static int[] diagonalBox2(int n,int[] arr)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n-1 || i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();

		}
		return arr;
		
	}

}