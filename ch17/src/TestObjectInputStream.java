import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        try (
                ObjectInputStream input =
                        new ObjectInputStream(new FileInputStream("object.dat"));
                ) {
            String name = input.readUTF();
        }
    }
}
