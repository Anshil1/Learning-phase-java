import java.util.Scanner;

public class ParameterOfRactangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Side A is=");
        int SideA= sc.nextInt();
        System.out.println("Side B is=");
        int SideB= sc.nextInt();
        int Parameter = 2*(SideA+SideB);
        System.out.println("Parameter of Ractangle ="+Parameter);

    }
}
