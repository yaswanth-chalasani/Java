import java.util.*;
class Prime
{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int str=s.nextInt();
    int last=s.nextInt();
    int sum=0,flag,temp;
    
    if (str > last) {
        temp = str;
        str = last;
        last = temp;
    }
    while (str < last) {
        flag = 0;
        for (int i = 2; i <= str / 2; ++i) {
            if (str % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(str);
            sum=sum+str;
        ++str;
    }
   System.out.println("Total :"+sum);
}   
}