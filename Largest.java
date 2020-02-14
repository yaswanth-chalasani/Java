public class Largest{
    public static void main(String[] args) {
        int a=40,  b=49, c=56;
        int Large=(a>b)? ((a>c)? a:c) :((b>c)? b:c);
        System.out.println("Largest Number :"+ Large);
    }
    
    }