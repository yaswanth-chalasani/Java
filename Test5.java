package newpage;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("RRR");
		list.add("QQQ");
		list.add("WWW");
		list.add("UUU");
		list.add("MMM");
		list.add("UXR");
		list
		.stream()
		.filter(s -> s.startsWith("U"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
	}

}
