import java.text.DecimalFormat;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        DecimalFormat df = new DecimalFormat("#.#"); //將小數四捨五入至小數點下第一位
        System.out.println(df.format(a*0.26418));
        System.out.println(df.format(b*0.26418));
    }
}
