import java.util.Scanner;
class Recursion {
   static int fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
