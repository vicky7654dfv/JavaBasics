package arrayPackage;

public class RecursiveFunction {

	public static void main(String[] args) {
		int[] arr= {8,5,8,2,9};
		recursive(arr,0);
		recursiveRev(arr,arr.length-1);

	}
   public static int recursive(int[] arr, int index)
   {
	   System.out.println("Function call "+index);
	   int tempi = index;

	   if(index<arr.length)
	   {
		   
		   System.out.println(index+" : "+arr[index]);
		   recursive(arr,++index);
	   }

	   System.out.println("Function return "+tempi);
	   return index;   
   }
   public static int recursiveRev(int arr[],int index) 
   {
	   if(index>=0)
	   {
		   System.out.println(arr[index]+" ");
		   recursiveRev(arr,--index);
	   }
	return index;
	   
   }

}
