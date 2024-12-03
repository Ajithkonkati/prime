public class PrimeCheck {

    public static void main(String[] args) {
        // You can call the checkPrime method with any number here
        int num = 29;  // Example: Change this number to check other values
        checkPrime(num);  // Call static method to check if the number is prime
    }

    // Static method to check if the number is prime
    public static void checkPrime(int num) {
        int temp = 0;

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
    }
}
