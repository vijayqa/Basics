class DemoConstructor
{
	int width, length, height;
	DemoConstructor(int width,int  length,int height)
	{
		System.out.println("constructor initialized");
		this.width=width;
		this.length=length;
		this.height=height;
	}
	
public	int volume()
	{
	System.out.print("the volume is ");
		return width*length*height;
	}
}
public class Constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DemoConstructor D1 = new DemoConstructor(10,20,30);
       DemoConstructor D2 = new DemoConstructor(30,15,25);
      int v =  D1.volume();
      System.out.println(v);
     // v=D2.volume();
     System.out.println(D2.volume());
   //  System.out.println(v);
       
	}
}
