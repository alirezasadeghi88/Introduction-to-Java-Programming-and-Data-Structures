import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectStreamForArray {
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("array.dat", true));
        ) {
            output.writeObject(numbers);
            output.writeObject(strings);
        }
    }
}
