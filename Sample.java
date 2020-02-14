package programs;
interface A
{
	void met1();
}
interface B extends A
{
	void met2();
	void met3();
}
 class x implements B
{
public void met1()
{
	System.out.println("one");
}
public void met2()
{
	System.out.println("Two");
}
public void met3()
{
	System.out.println("Three");
}
}
public class Sample {
	public static void main(String[] args) {
        B a;
		a=new x();
		a.met1();
		a.met2();
		a.met3();
	}
}