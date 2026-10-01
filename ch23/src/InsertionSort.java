public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            System.out.println("*");
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list [k];
                System.out.println("**");
            }

            list[k + 1] = currentElement;
        }
    }
}
