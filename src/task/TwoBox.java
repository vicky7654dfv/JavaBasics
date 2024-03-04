package task;

public class TwoBox {

	public static void main(String[] args) {
		int i=0,j=0;
		int[] arr=new int[10];
		int[] save=box(arr,i,j);
	}
	public static int[] box(int[] arr,int i,int j)
	{
		if(i<arr.length)
		{
			if(j<arr.length)
			{
		    if((i==arr.length/2 || j==arr.length/2 ) || (i==0 && j<arr.length/2) || (j==0 && i<arr.length/2) || (i==arr.length-1 && j>arr.length/2) || (j==arr.length-1 && i>arr.length/2) || (i+j==arr.length/2) || (i+j==(arr.length-1)+(arr.length/2+1)))
		      System.out.print("* ");
		    else
		      System.out.print("  ");
		    return box(arr,i,++j);
			}
		    System.out.println("  ");
			return box(arr,++i,0);
		}
		return arr;
	}
}