import java.util.Scanner;

public class VucutKitleEndeksiHesapla {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lufen Boyunuzu (metre cinsinde) Girinizi : ");
        boy = inp.nextDouble();

        System.out.print("Lutfen Kilonuzu giriniz : ");
        kilo = inp.nextInt();

        double indeks = kilo / (boy*boy);
        System.out.print("Vucut Kitle Indeksiniz : " + indeks);



    }
}
