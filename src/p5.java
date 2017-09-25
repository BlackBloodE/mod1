import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //身高cm
        int b = sc.nextInt(); //體重kg
        double c = (double) a;
        double d = (double) b;
        System.out.println(c/2.54);
        System.out.println(d/0.454);//尚未完成

    }
}
