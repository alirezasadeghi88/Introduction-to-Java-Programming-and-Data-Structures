public class TestPassByValue {
    public static void main(String[] args) {

    }

    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1
                + " and n2 is " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
