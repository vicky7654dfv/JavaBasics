package task;
import java.math.*;
public class PatternPrintHollowDiamond {

	public static void main(String[] args) {
		String s="Racecar";
		int mid=(s.length()/2)+1;
		for (int i=1;i<=s.length();i++) {
			for(int j=1;j<=s.length();j++) {
				if(i+j==mid+1 || i-j==s.length()/2 || j-i==s.length()/2 || i+j==s.length()+mid)
				{
					System.out.print(s.charAt(i-1));
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
	}
}
}