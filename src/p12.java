import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int n = scn.nextInt();
        System.out.println((float) Math.round(a*Math.pow(10,n))/Math.pow(10,n));
    }
}
