package arrayPackage;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr= {11,8,23,21,12,4,5,7,23,12};
		System.out.println("Duplicated elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			 if(arr[i]==arr[j]) 			
		     System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
				    count++;}
			}
		}
		System.out.print("Count of duplicates:"+ " "+count);

	}

}
