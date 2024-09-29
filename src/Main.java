import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first No.=");

        int a = sc.nextInt();
        System.out.print("Enter your Second No.=");
        int b=sc.nextInt();
        int c= b+a;

        System.out.println("Sum of two no. is="+c);
    }
}