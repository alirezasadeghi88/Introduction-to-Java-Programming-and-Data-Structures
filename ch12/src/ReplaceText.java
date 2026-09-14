import java.io.File;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
    }
}
