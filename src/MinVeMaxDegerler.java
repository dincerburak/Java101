import java.util.Scanner;

public class MinVeMaxDegerler {
    public static void main(String[] args) {
        int x, adet;
        int min=0,max=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kac tane Sayi Gireceksiniz : ");
        adet = inp.nextInt();

        for (int i=1;i<=adet;i++) {

            System.out.print(" " + i + ".Sayiyi Giriniz : ");
            x = inp.nextInt();
            if (i==1) {
                min = x; max = x;
            } if (x < min) {
                min = x;
            }if (x>max) {
                max=x;
            }
        }
        System.out.println("En Buyuk Sayi : " + max);
        System.out.println("En Kucuk Sayi : " + min);

    }
}
