
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m = {{0*0, 0*1, 0*2, 0*3}, {1*0,1*1,1*2,1*3}, {2*0,2*1,2*2,2*3}};
		int i,j=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
