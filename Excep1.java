package programs;

public class Excep1 {
	public static void main(String[] args) {
		int a=10,b=0;
		int c[]=new int[5];
	try {
	try {
		c[2]=100;
		System.out.println(c[7]);
	
	}
	catch(ArrayIndexOutOfBoundsException ie)
	{
	System.out.println(ie);	
	}
	System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
