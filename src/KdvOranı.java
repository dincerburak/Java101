import java.util.Scanner;

public class KdvOranı {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        boolean kdvDurumu;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz : ");
        tutar = input.nextDouble();

        kdvDurumu = (0<=tutar) && (1000>=tutar);
        kdvOran = kdvDurumu?0.18:0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDS'siz Tutar : " + tutar);
        System.out.println("KDV Orani : " + kdvOran);
        System.out.println("KDV Tutari : " + kdvTutar);
        System.out.println("KDV'li Tutari : " + kdvliTutar);

    }
}