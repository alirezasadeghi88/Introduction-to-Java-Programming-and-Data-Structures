import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = input.nextInt();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers are:");

        while (number <= n) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= (int)(Math.sqrt(number));
        }
    }
}
