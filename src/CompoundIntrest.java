import java.util.Scanner;

public class CompoundIntrest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P,R,T;
        System.out.println("Principle=");
        P=sc.nextInt();
        System.out.println("Rate=");
        R=sc.nextInt();
        System.out.println("Time=");
        T=sc.nextInt();
        double CompInterest=P*Math.pow((1+R*0.01),T);// Using math Library for power
        System.out.println("Compound Interest ="+CompInterest);
    }
}
