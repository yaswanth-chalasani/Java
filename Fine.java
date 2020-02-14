package program1;

public class Fine {

	public static void main(String[] s) {
		// TODO Auto-generated method stub
		try {
			int lenght=s[0].length()+s[1].length();
			if(lenght>10)
				return;
			System.out.println("Name length should be less than 10 in total");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("2 command line aruments required");
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
