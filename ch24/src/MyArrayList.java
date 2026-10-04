public class MyArrayList<E> implements MyList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    private int size = 0;

    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }


     @Override /** Add a new element at the specified index */
     public void add(int index, E e) {

          if (index < 0 || index > size)throw new IndexOutOfBoundsException
              ("Index: " + index + ", Size: " + size);
          ensureCapacity();
          for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
          data[index] = e;
          size++;
     }

     private void ensureCapacity() {
         if (size >= data.length) {
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
     }
}
