import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {

        int yas,yolculukTipi;
        double mesafe,normalTutar,toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Mesafeyi 'KM' Turunden Giriniz : ");
        mesafe = input.nextDouble();

        if (mesafe < 1) {
            System.out.println("Hatali Veri Girbiz. ! ");
            System.exit(0);

        } else {
            System.out.print("Yasinizi Giriniz : ");
        }
        yas = input.nextInt();
        if (yas < 1) {
            System.out.println("Hatali Veri Girniz ! ");
            System.exit(0);
        } else {
            System.out.print("Yolculuk Tipini Giriniz \n1-Tek Yon ,\n2-Gidis / Donus : ");
        }
        yolculukTipi = input.nextInt();
        if ((yolculukTipi != 1 ) && (yolculukTipi !=2)) {
            System.out.print("Hatali Veri Girdiniz : ");
            System.exit(0);
        }
        normalTutar = (mesafe * 0.10);
        toplamTutar = normalTutar;
        if ((yas>1) && (yas<200)) {
            if (yas<12) {
                toplamTutar = (normalTutar-(normalTutar *0.5));
            }
            else if((yas > 12) && (yas < 24)) {
                toplamTutar = (normalTutar - (normalTutar* 0.1));
            } else if(yas > 65) {
                toplamTutar = (normalTutar - (normalTutar*0.3));
            } if(yolculukTipi == 2) {
                toplamTutar = (toplamTutar -(toplamTutar* 0.20))*2;
            }
        }
        System.out.println("Toplam tutar: "+ toplamTutar);
    }
}
