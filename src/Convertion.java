
public class Convertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 199.3245;
		byte b = 1;
		int i = 233;
		//double d = 233.333;
		System.out.println("This is Byte " +b);
		b = (byte)i;
		System.out.println("This is int " +i +" of Byte " + b);
         i = (int) d;
         System.out.println("This is int " +i +" of double " + d);
         
	}

}
