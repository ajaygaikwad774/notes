public class Str{

   int a=10;
   int b=20;

   String str1="10";
   int c=20;
  
   void display(){
      System.out.println(a+b);
      System.out.println(str1+c);
   }

	public static void main(String[] args){
          
          Str obj = new Str();
          obj.display();
	}
}