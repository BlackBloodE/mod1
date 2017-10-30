import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();
        char ch1 = str2.charAt(0);
        char ch2 = str3.charAt(0);
        System.out.println(str.replace(ch1,ch2));
    }
}
