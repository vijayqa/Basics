
public class ForEach2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		int sum =0;
		for (int i : a)
		{
			sum = sum + i;
			System.out.println("The sum of " + i);
			if (i==5) break;
			
		}
		System.out.println("The summation " + sum);

	}

}
