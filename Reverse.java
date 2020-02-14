import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        int rem,rev=0;
        while(i>0)
        {
           rem=i%10;
           rev = (rev*10) + rem;
           i=i/10;
        }
        System.out.println("reverse of number:"+rev);
    }
}