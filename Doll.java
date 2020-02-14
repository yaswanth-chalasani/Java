package program1;

import java.util.Scanner;

public class Doll extends Thread {
public void run()
{
	while(true)
	{
		try
		{
			System.out.println("Have a nice Day");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			break;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doll d=new Doll();
		d.start();
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str!=null) d.interrupt();
		 
		
	}

}
