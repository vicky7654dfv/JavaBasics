package sorting;

public class SelectionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {20,12,10,15,2,55,102,-5,34,1};
		int minInx;
		for(int i=0;i<arr.length-1;i++)
		{
			minInx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minInx]>arr[j])
				{
					minInx=j;
				}
				int temp=arr[minInx];
				arr[minInx]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}