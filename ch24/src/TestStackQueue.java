public class TestStackQueue {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("Tom"); // Add Tom to the queue
        System.out.println("(7) " + queue);
    }
}
