
import java.util.*;
public class InputTables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner k=null;
		boolean w=false;
do{
	    do
		 {
		k = new Scanner(System.in);

			System.out.println("Enter number ");
		 } while(!k.hasNextInt());
		   m = k.nextInt();
		  // k.close();
		for (int i=1;i<=10;i++)
		    {
			System.out.println(m +" * " + i +" = " +m*i);
			}
		
		int n;
		Scanner k1;
		do {
			do{
				k1  = new Scanner(System.in);
		    	System.out.println("Enter 0 to quit, 1 to continue");
			  }while (!k1.hasNextInt());
		    n = k1.nextInt();
		  //  k1.close();
		   }while(n!=0 && n!=1);
		switch(n)
		{
		case 0: w =false;
		break;
		case 1: w=true;
		break;
		default: System.out.println("enter the valid value");
		k1.close();
		break;
		}	 
}while(w==true);
k.close();
	}	
 }       