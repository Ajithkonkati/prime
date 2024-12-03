import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int num, temp = 0;
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter any number to check for prime: ");
        num = scanner.nextInt();

        // Iterate up to num/2
        for (int i = 2; i <= num / 2; i++) {
            // Check if num is divisible by any number
            if (num % i == 0) {
                temp++;
                break;
            }
        }

        // Check for the value of temp and num
        if (temp == 0 && num != 1) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }

        scanner.close();
    }
}
