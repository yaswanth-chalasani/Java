package programs;

abstract class Animal {
 abstract void eat();
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("I eat only Non Veg");
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("I eat only Veg");
	}
}
class Test1
{
	public static void main(String[] args) {
		Animal A;
		 A=new Tiger();
		 A.eat();
		 A=new Goat();
		 A.eat();
	}
}