import java.util.Scanner;

public class UsHesabiAlanPrg {

    static int power(int a,int b){
            if (a == 1 | b == 0) {
                return 1;
            }
            return power(a, b-1)*a;
        }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.print("Ussu Alinacak Sayiyi Giriniz : ");
        a = scan.nextInt();
        System.out.print("Ussu Giriniz : ");
        b = scan.nextInt();

        System.out.println(power(a,b));
    }
}
