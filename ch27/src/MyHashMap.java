import java.util.LinkedList;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static int DEFAULT_INITIAL_CAPACITY = 4;
    private static int MAXIMUM_CAPACITY = 1 << 30;
    private int capacity;
    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
    private float loadFactorThreshold;
    private int size = 0;
    LinkedList<Entry<K, V>>[] table;

    public MyHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
    }

    public MyHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
    }

    public MyHashMap(int initialCapacity, float loadFactorThreshold) {
        if (initialCapacity > MAXIMUM_CAPACITY) this.capacity = MAXIMUM_CAPACITY;
        else
            this.capacity = trimToPowerOf2(initialCapacity);

        this.loadFactorThreshold = loadFactorThreshold;
        table = new LinkedList[capacity];
    }

    @Override
    public void clear() {
        size = 0;
        removeEntries();
    }

    @Override
    public boolean containsKey(K key) {
        if (get(key) != null)
            return true;
        else
            return false;
    }
}
