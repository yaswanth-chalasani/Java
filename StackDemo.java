package program1;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("Patrick");
		s.push("James Gosling");
		s.push("hai");
		s.push("Hello");
		s.push("Ed Frank");
		System.out.println("Stack element: "+s);
		System.out.println("First Element: "+s.peek());
		System.out.println("Stack Element: "+s);
		System.out.println("Popping Out: "+s.pop());
		System.out.println("Stack Element: "+s);
		s.push("java");
		System.out.println("after Adding: "+s);
		System.out.println("Popping Out: "+s.pop());
		System.out.println("Stack Element: "+s);
		System.out.println("First Element: "+s.peek());
		
		Enumeration e=s.elements();
		System.out.println("Elements are :");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
