


public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 100;
		String season = null;
		
		if (month == 12 || month == 1 || month == 2)
		season = "summer";
		else if(month == 3 || month == 4 || month == 5)
			season = "Rainy";
		else if(month == 6 || month == 7 || month == 8)
			season = "Autum";
		else if(month == 9 || month == 10 || month ==11)
			season = "winter";
		else season = "Not a valid month";
		System.out.println("This month is " + season);
		

	}

}
