import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream outputStream =
                        new ObjectOutputStream(new FileOutputStream("object.dat"));
        ){
            outputStream.writeUTF("John");
            outputStream.writeDouble(85.5);
            outputStream.writeObject(new java.util.Date());
        }
    }
}