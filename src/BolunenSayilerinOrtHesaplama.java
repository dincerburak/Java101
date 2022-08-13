import java.util.Scanner;

public class BolunenSayilerinOrtHesaplama {
    public static void main(String[] args) {
        int sayi, i,ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Griniz : ");
        sayi = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for(i = 1; i <= sayi; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet += 1;
            }
        }

        if(adet > 0) {
            ortalama = toplam / adet;
            System.out.println("Sayilarin ortalamasi Ekrandadir : "+ortalama);
        }
        else {
            System.out.println(sayi +"'dan kuçuk 3 ve 4'e bulunebilen bir sayi yoktur.");
        }

    }
}
