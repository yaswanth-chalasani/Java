package program1;
import java.util.*;
public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("oop", "Object oriented Programming");
		hm.put("object", "has state & behaviour");
		hm.put("class", "define state & behaviour share by obj");
		System.out.println(hm);
		Set s=hm.entrySet();
		System.out.println();
		System.out.println("\nhashmap current size: "+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(" "+ob);
		}
		TreeMap tm=new TreeMap();
		tm.put("xava is", "oop");
		tm.put("java is", "simple");
		tm.put("zava is", "robost");
		tm.put("rama is", "temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\nelements of treemap by iteration");
		System.out.println();
		 
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			Object ob1=itr1.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		System.out.println("\ntreemap current size:"+tm.size());
		tm.putAll(hm);
		System.out.println("\nputtimg a map into invoke map result will sort");
		System.out.println("\n"+tm);
		System.out.println(tm.remove("rama is")+": i am removed value");
		System.out.println("\ntree map current size:"+tm.size());
		System.out.println("\nchecking specific key/value status:"
		+tm.containsKey("java is")+""+tm.containsValue("temporary"));
		System.out.println("retrive value by key:"+hm.get("opp"));
		collection c=tm.values();
		System.out.println("\n values"+c);
		System.out.println("\n key"+tm.keySet());
	}
}
