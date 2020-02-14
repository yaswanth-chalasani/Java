package program1;
class TwoStrings
{
	static void print(String str1,String str2)
	{
		System.out.println(str1);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{	
		}
		System.out.println(str2);
	}
}
class PrintStringThread implements Runnable
{
	Thread td;
	String str1,str2;
	PrintStringThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		td=new Thread(this);
		td.start();
	}
	public void run()
	{
		TwoStrings.print(str1,str2);
	}
}
public class MainThread {

	public static void main(String[] args) {
		new PrintStringThread("Hello","there");
		new PrintStringThread("How are"," you?");
		new PrintStringThread("Thank you","very much");
	}

}
