public class TestStackQueue {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("Tom");
        System.out.println("(7) " + queue);

        queue.enqueue("Susan");
        System.out.println("(8) " + queue);
    }
}
