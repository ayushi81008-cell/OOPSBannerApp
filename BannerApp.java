public class BannerApp {

    // Inner Static Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to print banner
    public static void printBanner(CharacterPattern[] patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Patterns for O, P, S
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        // Create objects
        CharacterPattern o1 = new CharacterPattern('O', O);
        CharacterPattern o2 = new CharacterPattern('O', O);
        CharacterPattern p = new CharacterPattern('P', P);
        CharacterPattern s = new CharacterPattern('S', S);

        // Store in array
        CharacterPattern[] word = {o1, o2, p, s};

        // Print banner
        printBanner(word);
    }
}
