class TestObjectPassingDemo{
	int i,j;
	TestObjectPassingDemo(int a,int b)
	{
		i=a;
		j=b;
	}
	boolean equalsTo(TestObjectPassingDemo t)
	{
		if(t.i==i && t.j==j)return true;
		else return false;
	}
}
public class TestObjectPassing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestObjectPassingDemo d = new TestObjectPassingDemo(10,20);
		TestObjectPassingDemo d1 = new TestObjectPassingDemo(10,20);
		TestObjectPassingDemo d2 = new TestObjectPassingDemo(20,20);
		System.out.println("d==d1 " +d.equalsTo(d1));
		System.out.println("d==d3 " +d.equalsTo(d2));
		
	}

}
