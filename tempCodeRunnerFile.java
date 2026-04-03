import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Method to create and return character patterns
    public static Map<Character, String[]> getCharacterPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to print banner text
    public static void printBanner(String text, Map<Character, String[]> patterns) {
        int height = 5; // each character pattern has 5 rows

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = patterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {
        Map<Character, String[]> patterns = getCharacterPatterns();
        String word = "OOPS";
        printBanner(word, patterns);
    }
}