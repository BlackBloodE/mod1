import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String u =scn.next();
        int i = Integer.valueOf(u,16);
        System.out.println((char)i);
    }
}
