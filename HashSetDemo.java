package program1;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hs =new HashSet();
		hs.add("Sandeep");
		hs.add("Tilaka");
		hs.add("Deepak");
		hs.add("Elan");
		hs.add("Chithra");
		hs.add("Tilaka");
		hs.add("Elan");
		hs.add(null);
		System.out.println(hs);
	}

}
