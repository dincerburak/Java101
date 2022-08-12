import java.util.Scanner;

public class CinZodyagıHesaplama {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int yil, bolme;

        System.out.print("Dogum Tarihinizi Giriniz : ");
                yil = scanner.nextInt();

        bolme = yil % 12;

        switch (bolme) {
            case 0:
                System.out.println("Cin Zodyagi Burcunuz : Maymun" );
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi Burcunuz : Kopek");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi Burcunuz : Okuz");
                break;
            case 6:
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz : Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;
            default:
                System.out.println("Lutfen Sayi Olarak Girdiginizden Emin Olun ! ");
        }




    }
}
