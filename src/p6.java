import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //輸入字元
        char c = sc.next().charAt(0); //取切割符號
        String newStr = a.replace(c,'\n' ); //將c也就是切割符號替換為換行
        System.out.println(newStr);
    }
}
