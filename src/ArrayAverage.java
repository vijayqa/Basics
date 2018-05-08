
public class ArrayAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] num = {5.5f, 3.1f, 4.4f};
		float result = 0f;
		for(int i=0;i<num.length;i++)
		{
			//double result = 0;
			result = result + num[i];
			
		}
		System.out.println("The average of num is " + result/3);
	}

}
