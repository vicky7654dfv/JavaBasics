package task1;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int n=5;
		while(i<n)
		{
			while(j<n) {
			if((i==j && i<=n/2) || (i+j==n-1 && i<=n/2) || (j==n/2 && i>=n/2))
				System.out.print("* ");
			else
				System.out.print("  ");
			j++;
			}
			j=0;
			System.out.println("  ");
		i++;
		}

	}

}
