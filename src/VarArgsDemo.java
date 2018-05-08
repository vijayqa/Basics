
public class VarArgsDemo {
	static void varTest(int ... v)
      {
      	System.out.println("Length of v is " + v.length);
      	if(v.length!=0)
      	{
      	System.out.print("The values of v is ");
      	for(int x : v)
      	{
      		System.out.print(x + " ");
      	}
      	System.out.println();
      	}
      	else System.out.println("No Vlaues in v");
      }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varTest(10);
		varTest(0,3,10);
		varTest();
		

}
}