import java.util.Scanner;
 class SumOfDigitsAndArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the sum of digits
        int sumOfDigits = findSumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Check if it's an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to find the sum of digits of a number
    public static int findSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int n = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }
        return sum == originalNumber;
    }
}

