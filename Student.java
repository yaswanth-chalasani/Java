import java.util.Scanner;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int mark1=s.nextInt();
        int mark2=s.nextInt();
        int mark3=s.nextInt();
        int Total=mark1+mark2+mark3;
        int avg=(Total / 3);
        if(avg>=80)
        {
            System.out.println("First class");
        }
        else if(avg>=60&&avg<80)
        {
            System.out.println("Second class");
        }
        else if(avg<60&&avg>=45)
        {
            System.out.println("Third class");
        }
        else if(avg>=36&&avg<45)
        {
            System.out.println("Just pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}