class DemoConstructor1
{
	/*int width, length, height;
	DemoConstructor(int width,int  length,int height)
	{
		System.out.println("constructor initialized");
		this.width=width;
		this.length=length;
		this.height=height;
	}*/
	
public	int volume(int width, int length, int height)
	{
	System.out.print("the volume is ");
		return width*length*height;
	}
}
public class Parameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DemoConstructor1 D1 = new DemoConstructor1();
       DemoConstructor1 D2 = new DemoConstructor1();
      int v =  D1.volume(10,20,30);
      System.out.println(v);
     // v=D2.volume();
     System.out.println(D2.volume(45,32,12));
   //  System.out.println(v);
       
	}
}
