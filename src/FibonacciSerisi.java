import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Eleman Sayisi Giriniz :");
        int number = inp.nextInt();
        int a = 0, b = 1, total =0;

        for (int i = 1; i <= number; i++) {

            total = a + b;
            System.out.println(a + "+" + b + "=" + total);

            a = b;
            b = total;

            System.out.println();
        }
    }
}