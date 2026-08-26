public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }
}
