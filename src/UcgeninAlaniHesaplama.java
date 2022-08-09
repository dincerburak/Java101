import java.util.Scanner;

public class UcgeninAlaniHesaplama {
    public static void main(String[] args) {
        // üçgenin alanını bulma ÖDEVİ
        int a,b,c,u;
        double alan;


        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenari Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenari Giriniz : ");
        b = girdi.nextInt();
        System.out.print("3. Kenari Giriniz : ");
        c = girdi.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin Alani : " + alan);
    }
}
