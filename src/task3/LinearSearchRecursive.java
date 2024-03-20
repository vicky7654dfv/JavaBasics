package task3;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int arr[]= {5,12,3,45,26,17};
		int wanted=26;
		System.out.print(number(i,wanted,arr));
	}
		
	public static int number(int i,int wanted, int[] arr)
	{
		if(i<arr.length)
		{
				if(arr[i]==wanted)
					return i;
				else
					return number(++i,wanted,arr);
		}
		return i;
	}
}
