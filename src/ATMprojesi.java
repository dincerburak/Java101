import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {

        int select, price;
        int right = 3, balance = 1500;
        String userName, password;

        Scanner inp = new Scanner(System.in);

        while(right >0){
            System.out.print("Kullanici Adiniz : ");
            userName = inp.nextLine();

            System.out.print("Sifreniz: ");
            password = inp.nextLine();

            if(userName.equals("quibblees") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hos Geldiniz ! ");
                do {
                    System.out.println("1-Para Yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgulama\n" + "4-Cikis Yap\n");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("KaC para yatİrmak istiyorsunuz ? ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Kac para cekmek istiyorsunuz ? ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Gecersiz miktar . ");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Hesabinizdaki para miktari : " + balance);
                            break;
                        default:
                            System.out.println("Gecersiz bir deger girdiniz.");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Gorusuruz.");
            } else {

                right--;
                System.out.println("Gecersiz kullanici adi veya sifre. Tekrar deneyiniz.");

                if(right == 0) {
                    System.out.println("Hesabiniz kilitlenmistir. Lutfen bankayla iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz: " + right);
                }
            }
        }

    }
}
