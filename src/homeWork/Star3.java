package homeWork;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int i = 1;i<=rows;i++) { //For Loop for Row
		for(int j = 1; j <= i; ++j) { //For Loop for Col
		for(int k=1;k<i-1;k++)
		{
		System.out.print(" "); //Prints Space
		 }
		System.out.print("* "); //Prints *
	}
		System.out.println(); //Get to newline
		        

	}

}}
