package search;

public class RecursiveTernary {

	public static void main(String[] args) {
		int find=9;
		int[] arr1= {2,3,4,5,6,7,8,9,10,11,12,15,17,18,20};
		int left=0,right=arr1.length-1;
		System.out.println(ternarySearch(arr1,find,left,right));
	}
	public static int ternarySearch(int[] arr1, int find, int left, int right)
	{
		if(left<=right)
		{
		int mid1=left+(right-left)/3,mid2=right-(right-left)/3;
		
		if(arr1[mid1]==find)
			return mid1;
		if(arr1[mid2]==find)
			return mid2;
		
		if(arr1[mid1]>find)
			return ternarySearch(arr1,find,left,mid1-1);
		else if(arr1[mid1]<find && arr1[mid2]>find)
			return ternarySearch(arr1,find,mid1+1,mid2-1);
		else if(arr1[mid2]<find)
			return ternarySearch(arr1,find,mid2+1,right);
		
		}
		return -1;
	}
}
