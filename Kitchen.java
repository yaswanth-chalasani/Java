package house;

import java.util.Scanner;

public class Kitchen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int appliances[]=new int[n];
		int app[]=new int[n];
		for(int i=0;i<n;i++)
		{
			appliances[i]=s.nextInt();
			System.out.println(appliances[i]);
		}
		for(int i=0;i<n;i++)
		{
			app[i]=appliances[i];
			System.gc();
		}
		
	}

}
