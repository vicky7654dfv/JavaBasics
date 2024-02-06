package task;

public class PatternPrintHollowDiamond1 {

	public static void main(String[] args) {
		String s="Racecar";
		int len=s.length();
		if(len%2!=0)
		{
			int x=len/2;
			int y=len/2;
			boolean isReverse=true;
		
		for (int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(x==j || y==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("=");
				}
			}
			if(x==0)
			{
				isReverse=false;
			}
			if(isReverse)
			{
				x--;
				y++;
			}
			else
			{
				x++;
				y--;
			}
            System.out.println("");
	 }
	}
		else
		{
			System.out.println("Enter a odd value");
		}
}
}
