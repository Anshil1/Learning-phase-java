import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Of Triangle=");
        int Base= sc.nextInt();
        System.out.print("Enter Base Of Triangle=");
        int Height= sc.nextInt();
        double Area= Base*Height*0.5;

        System.out.println("Area of  Triangle="+Area);

    }
}
