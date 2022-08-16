import java.util.Scanner;

public class HarmonikSayilariBulma {
    public  static void main(String[] args) {
        //Harmonik sayı formulu 1 + (1/2) + (1/3) + ... (1/n)

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisini Giriniz : ");
        int n = input.nextInt();
        double result = 0;
        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
