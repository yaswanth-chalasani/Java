package programs;

public class StaticEx {
	static {
		System.out.println("This is first static block");
	}
	public StaticEx() {
		System.out.println("this is constructor");
	}
	public static String staticString="Static variable";
	static {
		System.out.println("this is second static block and "+staticString);
	}
	public static void main(String[] args) {
		StaticEx staEx=new StaticEx();
		StaticEx.staticMethod2();
	}
	static {
		staticMethod();
		System.out.println("This is third static block");
	}
	public static void staticMethod() {
		System.out.println("This is static Method");
	}
	public static void staticMethod2() {
		System.out.println("This is static method2");
	}
}
