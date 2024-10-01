package search;

public class MainSearch {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 7, 8, 9};
        int find = 7;
     	int left=0,right=array.length-1;
        print("linear", linearSearch(array, find), find);        
        print("binary", binarySearch(array, find), find);        
        recursiveBinarySearch(array,find,left,right);

    }

    public static void print(String search, int result, int find) {
        if (result != -1) {
            System.out.println(search + " - " + find +" is found at index: " + result);
        } else {
            System.out.println(search + "- number not found");
        }
    }



    public static int linearSearch(int[] array, int find) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int find) {

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (find == array[middle]) {
                return middle;
            } else if (find > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
    
    public static int recursiveBinarySearch(int[] array,int find,int left, int right) {
   
    	if(left<=right) {
    		int mid = (left+right)/2;
    	
    		if(mid==find)
    		{
    			return mid;
    		}
    		else if(mid<find)
    		{
    			return recursiveBinarySearch(array,find,mid+1,right);
    		}
    		else
    		{
    			return recursiveBinarySearch(array,find,left,mid-1);
    		}
    	}
		return -1;
    }

}