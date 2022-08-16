import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayi : ");
        n = input.nextInt();
        System.out.print("Us Olcak Sayi : ");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("SONUC : " + total);
    }
}
