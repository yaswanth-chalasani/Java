package programs;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,a=0;
		try {
		System.out.println(num/a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
