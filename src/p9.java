import java.text.DecimalFormat;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float fl1 = scn.nextFloat();
        float fl2 = scn.nextFloat();
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(fl1/600));
        System.out.println(df.format(fl2/600));
    }
}
