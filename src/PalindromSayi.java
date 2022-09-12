import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp !=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /=10;
        }
        if (number==reverseNumber) {
            System.out.println("Palindrome is a number ! ");
            return true;
        } else {
            System.out.println("Palindrome is not a number ! ");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        isPalindrom(number);

    }
}
