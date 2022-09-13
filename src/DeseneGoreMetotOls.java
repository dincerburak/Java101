import java.util.Scanner;

public class DeseneGoreMetotOls {
    static int negative(int x) {
        if (x <=0) {
            return x;
        } else{
            System.out.print(x +" ");
            return negative(x-5);
        }
    }
    static int positive(int x, int y) {
        if (x > y) {
            return x;
        }else {
            System.out.print(x +" " );
            return positive(x+5,y);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.print("\nEnter number : ");
            int number = inp.nextInt();
            positive(negative(number),number);
        }
    }
}
