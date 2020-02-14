import java.util.Scanner;
class Odd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for(int i=1;i<=N;i=i+2)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("total sum:"+sum);
    }
}