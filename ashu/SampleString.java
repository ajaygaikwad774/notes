public class SampleString{

String n="20";

   void ajay(){
   	int n=10;  //local variable
   	System.out.println(n);
   }

   void atul(){
   	System.out.println(n+n);
   }

	public static void main(String[] args) {
		SampleString s=new SampleString();
		s.ajay();
		s.atul();
	}
}