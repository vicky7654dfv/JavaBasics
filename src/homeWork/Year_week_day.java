package homeWork;

import java.util.Scanner;

public class Year_week_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, year, week, day;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the number of days:");
		 m = s.nextInt(); //500
		 year = m / 365; //1 year
		 m = m % 365; //135
		 System.out.println("No. of years:"+year);
		 week = m / 7; //19 weeks
		 m = m % 7; //2 days
		 System.out.println("No. of weeks:"+week);
		 day = m;
		 System.out.println("No. of days:"+day);

	}

}
