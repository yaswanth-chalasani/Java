package newpage;
import java.io.*;
public class Test 
{
	public static void main(String[] args)throws Exception 
	{
		String s1="pw2.java";
		String s2="pw1.java";
		int i;
		FileInputStream fis=new FileInputStream(s2);
		FileOutputStream fos=new FileOutputStream(s1,false);
		fis.skip(3);
		while((i=fis.read())!=-1)
		{
			fos.flush();
			fos.write(i);
		}	
			fos.close();
			fis.close();	
	}
}
