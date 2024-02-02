package loop;

public class ForLoop {

	public static void main(String[] args) {
		int arr[]= {21,19,17,18,109,200};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[arr.length-(i+1)]);
		}

	}

}