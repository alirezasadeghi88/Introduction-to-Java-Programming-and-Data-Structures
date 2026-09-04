public class VarArgsDemo {
    public static void main(String[] args) {

    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];
    }
}
