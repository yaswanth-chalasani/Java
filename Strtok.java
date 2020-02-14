package newpage;

import java.util.StringTokenizer;

public class Strtok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longestWord="";
		String s="please do, not touch ,my pet,aligator";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			String W=st.nextToken();
			if(W.length()>longestWord.length())
			{
				longestWord=W;
			}
		}
		System.out.println(longestWord);
		
	}

}
