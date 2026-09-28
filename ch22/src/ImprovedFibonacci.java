import java.util.Scanner;

public class ImprovedFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        System.out.println(
                "Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(long n) {

    }
}
