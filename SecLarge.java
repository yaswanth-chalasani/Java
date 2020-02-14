import java.util.Scanner;
class SecLarge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        {
                System.out.println("First Largest:"+a);
                if(b>c)
                {
                    System.out.println("Second Largest:"+b);
                }
                else
                {
                    System.out.println("Second Largest:"+c);
                }
        }
        else if(b>a&&b>c)
        {
            System.out.println("First Largest:"+b);
            if(a>c)
            {
                System.out.println("Second Largest:"+a);
            }
            else
            {
                System.out.println("Second Largest:"+c);
            }
        }
        else{
            System.out.println("First Largest:"+c);
            if(a>b)
            {
                System.out.println("Second Largest:"+a);
            }
            else
            {
                System.out.println("Second Largest:"+b);
            }
        }
    }
}