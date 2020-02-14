package programs;

public class Excep3 {
static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
