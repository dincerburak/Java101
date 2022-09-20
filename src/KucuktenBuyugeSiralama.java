import java.util.Arrays;
import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int number, temp=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu(array) Giriniz : ");
        number = inp.nextInt();

        if(number>0)
        {
            int[] arr = new int[number];
            for(int i=0;i<number;i++)
            {
                System.out.printf("%d. Elemani Giriniz:",i+1);
                arr[i]= inp.nextInt();
            }

            System.out.println("Girilen Dizi: "+Arrays.toString(arr));

            for(int i=0;i<number;i++)
            {
                for(int j=i+1;j<number;j++)
                {
                    if(arr[i] > arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Siralama : "+Arrays.toString(arr));
        }

        else
        {
            System.out.print("Hatali Bir Sayi Girdiniz !");
            System.exit(0);
        }
    }
}
