public class CountLettersInArray {
    public static void main(String[] args) {

    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    public static void displayCounts(int[] counts) {

    }
}
