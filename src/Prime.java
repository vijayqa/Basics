
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 14;
		boolean b;
		if (p<2)b=false;
		else b=true;
		for (int i=2;i<=p/i;i++)
		{
			if((p%i)==0)
				
			//	System.out.println("this is prime");
			    b=false;
			break;
			
		}
		
		 if (b)System.out.println("this is prime");
		 else System.out.println("this is not prime");

	}

}
