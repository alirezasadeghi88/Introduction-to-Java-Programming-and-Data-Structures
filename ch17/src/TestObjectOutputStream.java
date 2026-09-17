import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream output =
                        new ObjectOutputStream(new FileOutputStream("object.dat"));
                ) {
            output.writeUTF("John");
        }
    }
}
