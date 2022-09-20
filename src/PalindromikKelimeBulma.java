import java.util.Scanner;

public class PalindromikKelimeBulma {
    static boolean  PalindromikKelimeBulma(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kelime = " ";
        System.out.print("Denetlemek istediğiniz kelimeyi giriniz : ");
        kelime = inp.next();

        if (PalindromikKelimeBulma(kelime)&& !kelime.equals("0")) {
            System.out.print("-"+ kelime + "-Palindrom Kelimedir.");
        } else if (!PalindromikKelimeBulma(kelime) && !kelime.equals("0")) {
            System.out.print("-" + kelime + "-Palindrom Kelime Değildir ! ");
        }
    }
}
