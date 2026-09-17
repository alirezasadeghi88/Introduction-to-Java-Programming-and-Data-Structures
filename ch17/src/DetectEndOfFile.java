import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream output =
                         new DataOutputStream(new FileOutputStream("test.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }

            try (DataInputStream input =
                         new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
            }
        }
    }
}
