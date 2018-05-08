import java.util.Scanner;


public class SelectMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 0;
		String season;
		String months = null;
		
		while(true)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		try{
		month = Integer.parseInt(s.nextLine());
		}
		catch(Exception e) {
			System.out.println("Enter valid number");
		}
		if (month == 12 || month == 1 || month == 2)
		{
			season = "winter";
			if(month == 12) months = "decmber";
			else if(month == 1) months = "january";
			else if(month == 2) months = "Feb";
			System.out.println("The season and Month is " + season + " " + months);
		}
		else if (month == 3 || month == 4 || month == 5)
		{
			season = "summer";
			if(month == 3) months = "March";
			else if(month == 4) months = "April";
			else if(month == 5) months = "May";
			System.out.println("The season and Month is " + season + " " + months);
		}
		else if (month == 6 || month == 7 || month == 8)
			{
			season = "rainy";
			if(month == 6) months = "June";
			else if(month == 7) months = "July";
			else if(month == 8) months = "August";
			System.out.println("The season and Month is " + season + " " + months);
			}
		else if (month == 9 || month == 10 || month == 11)
		{
			season = "spring";
			if(month == 9) months = "September";
			else if(month == 10) months = "October";
			else if(month == 11) months = "November";
			System.out.println("The season and Month is " + season + " " + months);
		}
		else if (month == 0)
			  break;
		else 
			{
			season = "Not a Valid Month";
			System.out.println(season);
			}
	}
		
	}
}
