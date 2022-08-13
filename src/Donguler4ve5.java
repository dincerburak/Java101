import java.util.Scanner;

public class Donguler4ve5 {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("SINIR SAYISINI GIRINIZ : ");
        n = input.nextInt();

        System.out.println("Dordun Kuvvetleri : ");
        for (int i = 1; i <= n; i*=4){
            System.out.println(i);
        }
        System.out.println("Bes'in Kuvvetleri : ");
        for (int j = 1; j <= n; j*=5){
            System.out.println(j);

        }
    }
}
