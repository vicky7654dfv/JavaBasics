package test;

public class Task {

	public static void main(String[] args) {
	palindrome();
	ternarySearch();
	
	}
	public static void palindrome() {
		String name= "vignesh";

		boolean flag=true;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==name.charAt(name.length()-(i+1)))
				continue;
			else
			{
				flag=false;
				System.out.println("Not a Palindrome");
		        break;
			}
		}
		if(flag==true)
		System.out.println("Palindrome");
	}
	
	public static void ternarySearch()
	{
		int[] arr= {11,22,33,44,55,66,77,88};
		int left=0;
		int right=arr.length-1;
		int find=88;
		
		while(left<right) {
			int mid1= (left+(right-left)/3);
			int mid2= (right-(right-left)/3);
			
			if(find==arr[mid1]) {
				System.out.println(mid1);
			    break;
			}
			else if(find==arr[mid2]) {
				System.out.println(mid2);
				break;
			}
			else if(find<arr[mid1])
			{
				right=mid1-1;	
			}
			else if(find>arr[mid1] && find<arr[mid2])
			{
				left=mid1+1;
				right=mid2-1;
			}
			else if(find>arr[mid2])
			{
				left=mid2+1;
			}
			else
				System.out.println("Number is not in the array");
	   }
		
}
}