package task;

public class TaskNew {

	public static void main(String[] args) {
	    int[][] arr = new int[30][15];
	    int i=0,j=0;
	    task(arr,i,j);
	}
	public static int[][] task(int[][] arr, int i, int j)
	{
		if(i<arr.length)
		{
			if(j<arr[i].length)
			{
				if(j==arr[i].length/2 || i==(arr.length/4) || (i<arr.length/2 && i==j) || (i<arr.length/2 && i+j==arr[i].length-1))
					System.out.print("* ");
				else
					System.out.print("  ");
				return task(arr,i,++j);
			}
			System.out.println();
			return task(arr,++i,0);
		}
		return arr;
	}
}