import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
            int n = input.nextInt();

        System.out.println(n +"! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n) {

    }
}
