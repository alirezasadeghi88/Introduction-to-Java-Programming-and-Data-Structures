public class MyHashMap <K, V> implements MyMap<K, V> {
    private static int DEFAULT_INITIAL_CAPACITY = 4;
    private static int MAXIMUM_CAPACITY = 1 << 30;
    private int capacity;
    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
}
