package twoPointer;

public class Manipulation {

	public static void main(String[] args) {
		int[] arr= {7,21,8,9,16,23};
		int n=27;
		System.out.println(subclass(arr,n));
	}

	public static boolean subclass(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					return true;
				}
			}
		}
		return false;

	}
}
