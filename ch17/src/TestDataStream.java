import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
    public static void main(String[] args)throws IOException {
        try (
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream("temp.dat"));
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);

        }
    }
}
