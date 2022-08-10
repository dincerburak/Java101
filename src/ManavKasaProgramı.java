import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main (String[] args) {
        double armut, elma, domates, muz, patlican, total;
        double armutTutar = 2.14;
        double elmaTutar = 3.67;
        double domatesTutar = 1.11;
        double muzTutar = 0.95;
        double patlicanTutar = 5.00;


        Scanner kg = new Scanner(System.in);

        System.out.print("Armut Kac Kilo : ");
        armut = kg.nextDouble();

        System.out.print("Elma Kac Kilo : ");
        elma = kg.nextDouble();

        System.out.print("Domates Kac Kilo : ");
        domates = kg.nextDouble();

        System.out.print("Muz Kac Kilo : ");
        muz = kg.nextDouble();

        System.out.print("Patlican Kac Kilo : ");
        patlican = kg.nextDouble();

        total = armut * armutTutar + elma * elmaTutar + domates * domatesTutar + muz * muzTutar + patlican * patlicanTutar;

        System.out.print("Toplam Tutar: " +total +"TL");
    }
}
