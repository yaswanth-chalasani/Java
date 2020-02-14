 import java.util.Scanner;
 public class Even{
   public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
    String str=(n%2==0)? "even" : "odd";
    System.out.println(str);
  }
}