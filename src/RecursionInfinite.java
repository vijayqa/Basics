public class RecursionInfinite {  
	static int count =0;
static void p(){ 
	//int count=0;
	if (count <= 5){
		count++;	
System.out.println("hello");  
p();  
}
}  
  
public static void main(String[] args) {  
p();  
}  
}  
