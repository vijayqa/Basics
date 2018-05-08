class factorial
{
	int fact(int n)
	{
		int result;
		if (n==1) return 1;
		result = fact(n-1)*n;
		System.out.println(result);
		return result;
		
	}
}
public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
	System.out.println(f.fact(5));	

	}

}
