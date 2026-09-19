import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
                ) {
            inout.setLength(0);

            for (int i = 0; i < 200; i++)
                inout.writeInt(i);

            System.out.println("Current file length is " + inout.length());

            inout.seek(0);
        }
    }
}
