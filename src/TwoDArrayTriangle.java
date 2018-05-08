
public class TwoDArrayTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoD = new int[4][5];
	    int i,j,k=0;
		for( i=0;i<4;i++)
		{
			for( j=0;j<=i;j++)
			{
				//twoD[i][j]= twoD[i][j] + 1;
				twoD[i][j]=k;
		        k++;
		System.out.print(twoD[i][j] + " ");
	//	System.out.println();
			}
			System.out.println();
		}


	}

}
