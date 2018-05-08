
public class ContinueLabel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: for(int i=0;i<10;i++)
		{
			System.out.println("");
			   for(int j=0;j<10;j++)
			   {
				   if (i<j) continue outer;
				   System.out.print(i * j + " ");
			   }
		}

	}

}
