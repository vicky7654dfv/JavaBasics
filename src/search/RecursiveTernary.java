package search;

public class RecursiveTernary {

	public static void main(String[] args) {
		int n=9;
		int res=-1;
		int[] arr1= {2,3,4,5,6,7,8,9,10,11,12,15,17,18,20};
		ternarySearch1(arr1,n);
	}
	public static int ternarySearch(int[] arr1,int n) {
//	int start=0,end=arr1.length-1;
	//	int loopExecution=0;

	    if(start<=end) {
	//    	loopExecution++;
	    	int mid1=start+(end-start)/3;
	    	int mid2=end-(end-start)/3;
	    	
	        if(arr1[mid1]==n)
	        {
	        	res=mid1;
	        	return mid1;
	        }
	        if(arr1[mid2]==n)
	        {
	        	res=mid2;
	        	return mid2;
	        }

	        if(arr1[mid1]>n)
	        {
	    //    	end=mid1-1;
	        	ternarySearch1(start,mid1-1,arr1,n);
	        }
	        else if(arr1[mid2]>n)
	        {
	      //  	start=mid2+1;
	        	ternarySearch1(start,mid1-1,arr1,n);
	        }
	        else
	        {
	        	start=mid1+1;
	        	end=mid2-1;
	        }
			ternarySearch(arr1,n);
	    }
	    System.out.println("Binary search loop execution: "+loopExecution);
	    
	    return -1;

	}

}
