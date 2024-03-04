package search;

public class MainSearch {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 7, 8, 9};
        int find = 7;
        int mid=0;
        print("linear", linearSearch(array, find), find);        
        print("binary", binarySearch(array, find), find);        
        recursiveBinarySearch(array,find,mid);

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
    
    public static int recursiveBinarySearch(int[] array,int find,int mid) {
    	int left=0,right=array.length-1;
    	if(left<=right)
    		mid = (left+right)/2;
    	{
    		if(mid==find)
    		{
    			return mid;
    		}
    		else if(mid<find)
    		{
    			left=mid+1;
    			return recursiveBinarySearch(array,find,mid);
    		}
    		else
    		{
    			right=mid-1;
    			return recursiveBinarySearch(array,find,mid);
    		}
    	}
    }

}