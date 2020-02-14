package newpage;
import java.text.*;
import java.util.Date;
public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now= new Date("11 sep 1968");
		System.out.println(now);
		SimpleDateFormat ft=new SimpleDateFormat("e dd mmm yyy 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(now));
		ft=new SimpleDateFormat("dd.mm.yyyy");
		Date d=new Date();
		System.out.println(ft.format(d));
	}

}

