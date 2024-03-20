package task3;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int find=44;

		int arr[]= {11,22,33,44,55,66};
		int left=0,right=arr.length-1;
		int mid= (left+right)/2;
		System.out.print(method(mid,arr,find,left,right));
	}
	
	
	public static int method(int mid,int[] arr,int find,int left, int right)
	{
		if(left<arr.length/2) {

		if(find==arr[mid])
			return mid;
		else if(find<arr[mid])
		{
			right=arr.length/2;
			{
				if(arr[left]==find)
					return left;
				else
					return method(mid,arr,find,++left,right);
			}
		}
	    else if(find>arr[mid])
			{
				left=(arr.length/2)+1;
		
				if(arr[left]==find)
				 {
					return left;
				 }
				 else
				 {
					return method(mid,arr,find,++left,right);
				 }
				
				}		
		}
		return left;	
	}
}
