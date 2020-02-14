package programs;

class Stu
{
	String name;
	Stu(String s)
	{
		name=s;
	}
	String getName()
	{
		return name;
	}
}
public class Str {
	public static void main(String[] args) {
	Stu s1[]=new Stu[2];
	s1[0]=new Stu("Mary");
	s1[1]=new Stu("John");
	for(int i=0;i<s1.length;i++) {
		
  System.out.println("Name:"+s1[i].getName());
	}
	}
}
