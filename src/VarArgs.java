
public class VarArgs {
 static void var(int ...var)
 {
	 System.out.print("The variable got " + var.length + " contents ");
	 for ( int v : var)
	 {
		 System.out.print(v +" ");
	 }
	 System.out.println(" ");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var(10,19,23);
		var();

	}

}
