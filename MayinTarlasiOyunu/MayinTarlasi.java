package MayinTarlasiOyunu;
import java.util.Scanner;
public class MayinTarlasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Satir sayisi : ");
        int a = inp.nextInt();
        System.out.print("Sutun sayisi : ");
        int b = inp.nextInt();
        String[][] alan = MineSweeper.mayinTarlasiAlani(a, b);
        String[][] bosAlan = MineSweeper.bosAlan(a, b);
        MineSweeper.print(bosAlan);

                //MineSweeper.print(alan);

        MineSweeper.check(alan, bosAlan, a, b);
    }
}
