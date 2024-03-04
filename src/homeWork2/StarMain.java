package homeWork2;

public class StarMain {

	public static void main(String[] args) {
		int n=5,a=7,b=9;
		int i=0,j=0;
		int[] arr=new int[n];
		int[][] arr1=new int[a][b];
		
		System.out.println("square + diagonal");
		diagonalBox(arr,i,j);
		
		System.out.println("square");
        diagonalBox1(i,j,arr);
		
        System.out.println("Shape3");
		diagonalBox2(i,j,arr);
		
    	System.out.println("ZigZag Shape");
		jumping(i,j,arr1);
		
		

	}
	public static int diagonalBox(int[] arr,int i,int j)
	{
		if(i<arr.length)
		{
			if(j<arr.length)
			{
				if(i==j || i+j==arr.length-1 || i==0 || j==0 || i==arr.length-1 ||j==arr.length-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
				
				return diagonalBox(arr,i,++j);
			}
			System.out.println();
			return diagonalBox(arr,++i,0);
			
		}
		return i;
    }

	
	public static int diagonalBox1(int i,int j,int[] arr)
	{
		if(i<arr.length)
		{
			if(j<arr.length)
			{
				if(i==0 || j==0 || i==arr.length-1 ||j==arr.length-1 )
					System.out.print("* ");
				else
				    System.out.print("  "); 
				return diagonalBox1(i,++j,arr); 
			}
			System.out.println();
			return diagonalBox1(++i,0,arr);
		}
		return i;
	}
	
	public static int diagonalBox2(int i,int j,int[] arr)
	{
		while(i<arr.length)
		{
			while(j<arr.length)
			{
				if(j==0 || i==arr.length-1 || i+j==arr.length-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				return diagonalBox2(i,++j,arr);
			}
			System.out.println();
			return diagonalBox2(++i,0,arr);

		}
		return i;
	}
	
	public static int jumping(int a,int b,int[][] arr1)
	{
		if(a<arr1.length)
		{
			if(b<arr1[a].length)
			{
				if(a==0 || b==0 || a==arr1.length-1 || b==arr1[a].length-1 || a==arr1.length/2 || b==arr1[a].length/2 || b%2!=0)
				System.out.print("* ");
				else
					System.out.print("  ");
				return jumping(a,++b,arr1);	
			}
			System.out.println();
			return jumping(++a,0,arr1);
		}
		return a;
	}

	}