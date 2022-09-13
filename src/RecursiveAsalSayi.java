import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = inp.nextInt();
        prime(number,2);
    }
    static void prime(int number, int i) {
        if(i == number) {
            System.out.print(number +"\nIs a prime number ! ");
            return;
        } else if (number % i == 0) {
            System.out.print(number +"\nIs not a prime number ! ");
            return;
        }
        prime(number,i + 1);
    }
}

