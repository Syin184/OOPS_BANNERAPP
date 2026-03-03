/**
 * OOPSBannerApp
 *
 * UC6: Display "OOPS" banner using static helper methods
 * to generate character patterns (O, P, S).
 *
 * @author YourName
 * @version 1.5
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join(" ", o[i], o[i], p[i], s[i])
            );
        }
    }

    // Helper method to build letter O
    public static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Helper method to build letter P
    public static String[] buildP() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Helper method to build letter S
    public static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}