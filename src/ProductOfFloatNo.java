import java.util.Scanner;

public class ProductOfFloatNo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your first no. =");

        Float A = sc.nextFloat();
        System.out.print("Enter your Second no. =");
        Float B = sc.nextFloat();
        Float C = A*B;
        System.out.println("Product of two no="+C);
    }
}
