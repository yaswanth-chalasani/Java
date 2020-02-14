package newpage;
@FunctionalInterface
interface MyFunctionalInterface{
	public String sayHello(String str);
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface msg=(str) ->{
			return str;
		};
		System.out.println(msg.sayHello("QWERTY"));
	}

}
