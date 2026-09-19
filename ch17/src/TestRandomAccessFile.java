import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
                ) {

        }
    }
}
