/**
 * OOPSBannerApp
 *
 * UC3: Display "OOPS" banner using String.join()
 * to avoid string concatenation with '+'.
 *
 * @author YourName
 * @version 1.2
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", "*****",  "*****",  "*****",  "*****"));
        System.out.println(String.join(" ", "*     *","*     *","*     *","*     *"));
        System.out.println(String.join(" ", "*     *","*     *","*     *","*      "));
        System.out.println(String.join(" ", "*     *","*     *","*     *"," ***** "));
        System.out.println(String.join(" ", "*     *","*     *","*     *","      *"));
        System.out.println(String.join(" ", "*     *","*     *","*     *","*     *"));
        System.out.println(String.join(" ", "*****",  "*****",  "*****",  "*****"));
    }
}