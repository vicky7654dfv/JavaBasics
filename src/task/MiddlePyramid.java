package task;

public class MiddlePyramid {

	public static void main(String[] args) {
		int num=5;
		int x=num/2;
		int y=num/2;
		int value=1;
		boolean isReverse=true;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				;if(x==j || y==j)
					System.out.print(value);
				else
					System.out.print("");
				if(x==0)
				{
					break;
				}
				if(isReverse)
				{
					x--;
					y++;
				}
				else
				{
					break;
				}
	            System.out.println("");
	       }System.out.println();
	}
		}
	}	