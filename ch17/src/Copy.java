import java.io.File;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetfile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0]
                    + " does not exist");
        }
    }
}
