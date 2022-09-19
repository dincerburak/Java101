import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayiBulma {
    public static void main(String[] args){
        int number;
        int[] dizi= {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : "+ Arrays.toString(dizi));

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        number = inp.nextInt();

        Arrays.sort(dizi);
        for (int x =0; x<dizi.length; x++) {
            if (dizi[x] > number) {
                System.out.println("Girilen Sayidan Kucuk En Yakin Sayi : " +dizi[x-1]);
                break;
            }
        }
        for (int y = 0; y<dizi.length; y++) {
            if (dizi[y] > number) {
                System.out.println("Girilen Sayidan Buyuk En Yakin Sayi : "+dizi[y]);
                break;
            }
        }
    }
}
