import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
    }
}
