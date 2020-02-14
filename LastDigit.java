import java.util.Scanner;
class LastDigit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int lastdigit = (n%10);
        System.out.println(lastdigit);
        switch(lastdigit)
        {
            case 0:System.out.println("zero");break;
            case 1:System.out.println("one");break;
            case 2:System.out.println("two");break;
            case 3:System.out.println("three");break;
            case 4:System.out.println("four");break;
            case 5:System.out.println("five");break;
            case 6:System.out.println("six");break;
            case 7:System.out.println("seven");break;
            case 8:System.out.println("eight");break;
            case 9:System.out.println("nine");break;
            default:System.out.println("");break;

        }
    }
}