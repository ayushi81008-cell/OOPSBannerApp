public class OOPSBannerApp1 {

    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of banner lines [cite: 98]
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join() [cite: 81, 98]
        lines[0] = String.join(" ", "   *** ", "   *** ", "****** ", " ***** ");
        lines[1] = String.join(" ", "  ** ** ", "  ** ** ", "** ** ", " ** ** ");
        lines[2] = String.join(" ", " ** ** ", " ** ** ", "** ** ", " ** ");
        lines[3] = String.join(" ", " ** ** ", " ** ** ", "****** ", " ***** ");
        lines[4] = String.join(" ", " ** ** ", " ** ** ", "** ", "      ** ");
        lines[5] = String.join(" ", "  ** ** ", "  ** ** ", "** ", " ** ** ");
        lines[6] = String.join(" ", "   *** ", "   *** ", "** ", " ***** ");

        // 3. Use an enhanced for-each loop to print each line sequentially [cite: 83, 84, 98]
        for (String line : lines) {
            System.out.println(line);
        }
    }
}