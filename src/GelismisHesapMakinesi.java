import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static  int minus(int a, int b) {
        int result = a-b;
        System.out.println("Cikarma : "+ result);
        return result;
    }

    static int times(int a, int b) {
        int result = a*b;
        System.out.println("Carpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b==0) {
            System.out.println("Ikinci Sayi 0'dan farkli Olmalidir. ");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolme : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }
    static void calc(int a, int b) {
        System.out.println("Cevresi : " + (2 * (a+b)));
        System.out.println("Alani : " + (a + b));
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i=1; i<=b; i++) {
            result *=a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdortgen Alan ve Cevre Hesabı\n"
                + "8- Cikis Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir Islem Seciniz : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("Ilk Sayi Girin : ");
            int a = scan.nextInt();
            System.out.print("Ikinci Sayi Girin : ");
            int b = scan.nextInt();


            switch (select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided (a,b);
                    break;
                case 5:
                    System.out.println("Us Hesabi : " + power(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz Bir İslem Girdiniz ! ");
            }

        }
        System.out.println("Cikis Yapildi. ");
    }
}