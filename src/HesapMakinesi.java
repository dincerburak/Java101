import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        n1 = girdi.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2 = girdi.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz: ");
        select = girdi.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " +(n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: " +(n1 - n2));
                break;
            case 3:
                System.out.println("Carpma: " +(n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayi 0'a bolunemez !");
                        break;
                    default: System.out.println("Bolme: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz.");
        }
    }
}
