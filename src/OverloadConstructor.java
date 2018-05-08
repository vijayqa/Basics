class Box1
{
	int width;
	int height;
	int length;
	
	Box1 (Box1 b)
	{
		width = b.width;
		height = b.height;
		length = b.length;
	}
	Box1 (int w, int h, int l)
	{
		width = w;
		height =h;
		length =l;
	}
	Box1 (int w1)
	{
		length=height=width = w1;
	}
	Box1 (Boolean b)
	{
		b=true;
	}
	int vol()
	{
     int volume = width * height * length;
     return volume;
	}
}
public class OverloadConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Box1 ob = new Box1(10,20,30);
	Box1 ob1 = new Box1(10);
	Box1 clone = new Box1(ob);
	Box1 clone1 = new Box1(ob1);
System.out.println(ob.vol());
System.out.println(ob1.vol());
System.out.println(clone.vol());
System.out.println(clone1.vol());
	}
}
