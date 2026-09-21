public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {Integer.valueOf(2), Integer.valueOf(4),
                Integer.valueOf(3)};

        Double[] doubleArray = {Double.valueOf(3.4), Double.valueOf(1.3),
                Double.valueOf(-22.1)};

        Character[] charArray = {Character.valueOf('a'),
                Character.valueOf('J'), Character.valueOf('r')};

        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.print("Sorted Integer objects: ");
        printList(intArray);
    }
}
