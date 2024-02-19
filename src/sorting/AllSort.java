package sorting;

public class AllSort {

	public static void main(String[] args) {
		int[] arr= {21,9,16,18,17,2};
		
		System.out.println("***********Bubble sort***********");
		int[] arr1=bubbleSort(arr);
		for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
		
		System.out.println("***************Selection sort**************");
		int[] arr2=selectionSort(arr);
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		
		System.out.println("***************Insertion sort**************");
		int[] arr3=selectionSort(arr);
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
		
	}
	public static int[] bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{ int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;

		}
		return arr;
	}
	
	public static int[] insertionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int currentVal= arr[i];
		    int j=i-1;
		    while(j>=0 && arr[j] >currentVal) 
		    {
		    	arr[j+1]=arr[j];
		    	j--;
		    }
		}
		return arr;
	}
}