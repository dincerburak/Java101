import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, a, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yari Capini Giriniz : ");
        r = inp.nextInt();

        Scanner inputa = new Scanner(System.in);
        System.out.print("Merkez Acisinin Olcusu Giriniz : ");
        a = inputa.nextDouble();
        alan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Diliminin Alani : " + alan);

    }
}
