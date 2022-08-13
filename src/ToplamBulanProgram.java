import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ToplamBulanProgram {
    public static void main(String[] args) {
        int total = 0;
        int n;
            Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Sayi Giriniz : ");
            n = scan.nextInt();
            if ( n % 4 == 0) {
                total += n;
            }
        }while ((n % 2) == 0);

        System.out.println("Toplam : " + total);
    }
}
