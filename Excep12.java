package programs;

public class Excep12 {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		    System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception ie)
		{
		System.out.println(ie);	
		}
	}

}
