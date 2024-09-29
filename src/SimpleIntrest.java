import java.util.Scanner;

public class SimpleIntrest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P,R,T;
        System.out.println("Principle=");
        P= sc.nextInt();
        System.out.println("Rate=");
        R= sc.nextInt();
        System.out.println("Time=");
        T= sc.nextInt();
        double S= P*R*T*0.01;
        System.out.println("Simple Intrest is="+S+"%");
    }
}
