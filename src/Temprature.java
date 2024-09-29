import java.util.Scanner;

 class Temprature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Float F;
        System.out.print("Fahrenhit=");
        F=sc.nextFloat();
        double C = (F-32)* 5/9;
        System.out.println("C="+C);


    }
}
