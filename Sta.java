package programs;

public class Sta {
	 int a;
	Sta(){
	}
	void display()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			Sta se=new Sta();
			se.display();
		}
	}
}
