class Box2
{
	int i,j;
	Box2 (int a, int b)
	{
		i=a;
		j=b;
	}
	void test(Box2 b)
	{
		b.i*=2;
		b.j/=2;
	}
}
public class CallByReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box2 b1 = new Box2(10,20);
     System.out.println("Before calling the method " + b1.i+ " " + b1.j);
     b1.test(b1);
     System.out.println("After executing the method " + b1.i + " " + b1.j);
     
	}

}
