import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String []argh) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("a Sayisi : ");
        a = input.nextInt();

        System.out.print("b Sayisi : ");
        b = input.nextInt();

        System.out.print("c Sayisi : ");
        c = input.nextInt();

        if ((a<b && a<c)){
            if (b<c){
                System.out.println("a < b < c");
            }else{
                System.out.println("a < c < b");
            }
        }else if ((b<a && b<c)){
            if (a<c){
                System.out.println("b < a < c");
            }else{
                System.out.println("b < c < a");
            }
        }else{
            if (a<b){
                System.out.println("c < a < b");
            }else{
                System.out.println("c < b < a");
            }
            
        }
    }
}
