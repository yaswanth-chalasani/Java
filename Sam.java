package programs;
class A1
{
	int X=100;
	A1(){
		System.out.println("A");
	}
}
class B1 extends A1
{
	B1(){
		System.out.println("B");
	}
}
public class Sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj=new B1();
	}

}
