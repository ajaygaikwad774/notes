public class Ashu{
int a=10,b=5,c;
void add(){
c=a+b;
System.out.println("Addition of two numbers a="+a + " b="+b +" C="+c);
}
void sub(){
c=a-b;
System.out.println("Subtraction of two numbers a="+a + " b="+b +" C="+c);
}
void mul(){
c=a*b;
System.out.println("Multiplication of two numbers a="+a + " b="+b +" C="+c);
}
void div(){
c=a/b;
System.out.println("Division of two numbers a="+a + " b="+b +" C="+c);
}


public static void main(String[] args) {
	Ashu obj=new Ashu();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
}

}