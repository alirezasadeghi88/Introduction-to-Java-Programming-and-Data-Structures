
public class InsertionSortTest {


    static {
        System.out.println("start");
    }
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[] list = {1, 2, 3, 4, 7, 6, 5};
        InsertionSort.insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
