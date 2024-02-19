package twoPointer;

public class DescendingOrder {

	public static void main(String[] args) {
		int arr[]= {7,21,8,9,16,23};
		int i=0,j=i+1;
		
		for(int i=0;i<sub(arr).length;i++)
		System.out.println(sub(arr,i,j));
		
	}
	public static int[] sub(int[] arr,int i,int j)
	{
	
		while(i<arr.length) {
			while(j<arr.length) {

		if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		sub(arr,i,++j);
		}		
			sub(arr,++i,j);



		}
		return arr;
	}

}
