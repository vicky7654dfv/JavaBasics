package arrayPackage;

public class OddEvenArrayElementsRecursion {

	public static void main(String[] args) {
		int num[]= {23,56,88,51,0,3,79,12,88,56};
		int[] num1=new int[10];
		int[] num2=new int[10];
		odd(num,num1,0);
		System.out.println();
		even(num,num2,0);
		System.out.println();
		repeat(num,0,1);
		}
	public static int odd(int[] num,int[] num1,int i)
	{
		if(i<num.length) {
		if(num[i]%2==0)
		{
			num1[i]=num[i];
		    System.out.print(num1[i]+ " ");
		}
		   odd(num,num1,++i);

		}
		return i;
	}
	
	public static int even(int[] num,int[] num2,int ii)
	{
		if(ii<num.length) {

		if(num[ii]%2!=0)
		{
			num2[ii]=num[ii];
		    System.out.print(num2[ii]+ " ");
		}
		   even(num,num2,++ii);

		}
		return ii;
	}
	public static int repeat(int[] num,int i,int g)
	{
		if(g<num.length-1) {
		g=g+1;}
		else { i=i+1; g=i+1;}
		if(i<num.length-1) {
			if(num[i]==num[g]) {
				System.out.print(num[i]+" ");
			}
			repeat(num,i,g);
		}
		return i;
	}
	
}
