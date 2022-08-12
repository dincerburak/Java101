import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        int yil;
        System.out.print("Yil Giriniz : ");
        yil = main.nextInt();

        if(yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil + " Artik Yil ! ");
            }
            else {
                System.out.print(yil + " Artik Yil Degildir ! ");
            }
        } else if (yil % 4 == 0 ) {
            System.out.print(yil + " Artik Yil ! ");
        } else {
            System.out.print(yil + " Artik Yil Degildir ! ");
        }
    }
}
