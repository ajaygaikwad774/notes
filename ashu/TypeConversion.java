public class TypeConversion{

long l=20;   //widening 8 byte

int i = (int)l; // 4 byte

void display(){
	System.out.println(l);
}

	public static void main(String args[]){
     
     TypeConversion ty =new TypeConversion();
     ty.display();

	}
}