import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Value of a="+a);
        int b=sc.nextInt();
        System.out.println("Value of b="+b);
        int c,d;
        c=a;
        d=b;
        b=c;
        a=d;
        System.out.println("Swaping  value of a="+a);
        System.out.println("Swaping  value of b="+b);
    }
}
