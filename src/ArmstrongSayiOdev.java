import java.util.Scanner;

public class ArmstrongSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int basValue;
        int result = 0;

        while (number !=0) {
            basValue = number % 10;
            number /= 10;
            basNumber++;
            System.out.println("Girilen Sayinin Basamaklari : " + basValue);

            result += basValue;
        }
        System.out.println("Basamaklarin toplami : " + result);
    }
}
