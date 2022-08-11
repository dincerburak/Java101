import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main (String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz : ");
        heat = input.nextInt();

        if (heat <= 5) { System.out.println( "Kayak Yababilirsin."); }
        else if ( heat>5 && heat<=15) {System.out.println(" Sinemaya Gidebilirsiniz ."); }
        else if ( heat>=15 && heat<=25) { System.out.println( " Piknige Fidebilirsiniz .");}
        else if ( heat>=25) { System.out.println( " Yuzmeye Gidebilirsiniz .");}

    }
}
