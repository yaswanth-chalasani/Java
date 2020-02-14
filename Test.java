package programs;
class emp{
int eno=101;
	void disp() {
		System.out.println(eno);
	}
}
class manager extends emp
{
	void display() {
		disp();
		System.out.println("Manager class");
	}
}
public class Test {
public static void main(String[] args) {
	manager m=new manager();
	m.display();
}
}