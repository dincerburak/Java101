import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        if(mat < 0 || mat > 100)
            mat = 0;
        if(fizik < 0 || fizik > 100)
            fizik = 0;
        if(turkce < 0 || turkce > 100)
            turkce = 0;
        if(kimya < 0 || kimya > 100)
            kimya = 0;
        if(muzik < 0 || muzik > 100)
            muzik = 0;

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        if (ortalama <=55) {
            System.out.println("Sinifta Kaldiniz, Seneye Tekrar Gorusmek Uzere ! ");
        }else {
            System.out.println("Tebrikler, Sinifi Gectiniz ! ");
        }
        System.out.println("Ortalamaniz : " + ortalama);
    }
}
