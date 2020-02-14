package newpage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("RRR");
		list.add("QQQ");
		list.add("WWW");
		list.add("UUU");
		list.add("MMM");
		list.add("UXR");
		stream.of("a1","a2","a3");
		.findFirst()
		.ifPresent(System.out::println);
		Arrays.stream(new int[] {1,2,3})
		.map(n->2*n+1)
		.average()
		.ifPresent(System.out::println);
	}

}
