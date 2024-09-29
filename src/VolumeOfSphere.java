import java.util.Scanner;

public class VolumeOfSphere
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Radius=");
        int r=sc.nextInt();
        int R = r*r*r;
        double pie= 3.14;
        double volume= 4/3*pie*R;
        System.out.println("Volume of sphere="+volume);
    }
}
