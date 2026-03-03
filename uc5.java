/**
 * OOPSBannerApp
 *
 * UC5: Display "OOPS" banner using combined array
 * declaration and initialization with String.join().
 *
 * @author YourName
 * @version 1.4
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join(" ", "*****",  "*****",  "*****",  "*****"),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "*     *", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "      *"),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*****",  "*****",  "*****",  "*****")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}