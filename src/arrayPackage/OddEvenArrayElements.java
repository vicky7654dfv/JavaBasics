package arrayPackage;


public class OddEvenArrayElements {

	public static void main(String[] args) {
		int[] arr= {11,8,23,21,12,4,5,7,23,12};
		int[] odd=new int[10];
		int[] even=new int[10];
		int size1=0;
		int size2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				size1++;
			else
				size2++;
		}
		int j=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0) 
				{ even[j]=arr[i];
			    j++; }
		}
		int k=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2!=0)
				{ odd[k]=arr[i];
			    k++; }
		}
		System.out.println("ODD Array: ");
		for(int i=0;i<size2;i++)
		{
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.println("EVEN Array: ");
		for(int i=0;i<size1;i++)
		{
			System.out.print(even[i]+" ");
		}
		

	}

}
