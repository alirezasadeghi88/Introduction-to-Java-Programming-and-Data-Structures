import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceOfWords {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[\\s+\\p{P}]");
        for (int i = 0; i < words.length; i++) {

        }
    }
}
