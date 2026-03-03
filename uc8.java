// Import required package
import java.util.HashMap;
import java.util.Map;

// Creating Class with name OOPSBannerApp
// Purpose: Render banner word using Map for pattern management
class OOPSBannerApp {

    // Create a Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Load patterns into Map
        loadPatterns();

        // Word to print
        String word = "OOPS";

        // Render banner
        renderBanner(word);
    }

    // Function to load character patterns into HashMap
    private static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner using nested loops
    private static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                // Retrieve pattern from Map
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}