import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        double a = Math.PI*Math.pow(r,2)*h;
        System.out.println(a);

    }
}
