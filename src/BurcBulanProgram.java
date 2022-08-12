import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay,gun;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz Ay : ");
        ay = input.nextInt();

        System.out.print("Dogdugunuz Gun : ");
        gun = input.nextInt();

        if(ay >= 1 && ay <=12 && gun >= 1) {
            if((ay == 1) && (gun <= 21) || (ay == 12) &&(gun > 22 && gun <= 31))
                burc = "oglak";

            else if ( ((ay == 1) && (gun >21 && gun <= 31)) || ( ay == 2 && gun <= 19 ) )
                burc = "kova";

            else if ( ((ay == 2) && (gun > 19 && gun <= 29)) || ( ay ==3 && gun <= 2) )
                burc = "balik";

            else if ( ((ay == 3) && (gun > 20 && gun <= 31)) || (ay == 4 && gun <= 20) )
                burc = "koc";

            else if( ((ay == 4) &&(gun > 20 && gun <= 30)) || (ay == 5 && gun <= 21) )
                burc = "boga";

            else if ( ((ay == 5) && (gun > 21 && gun <= 31)) || (ay == 6 && gun <= 22) )
                burc = "ikizler";

            else if ( ((ay == 6) && (gun > 22 && gun <= 30)) || (ay == 7 && gun <= 22) )
                burc = "yengec";

            else if( (ay == 7) && (gun > 22 && gun <= 31) || (ay == 8) && (gun <= 22) )
                burc = "aslan";

            else if ( (ay == 8) && (gun > 22 && gun <= 31) || (ay == 9 && gun <= 22) )
                burc = "basak";

            else if ( (ay == 9) && (gun > 22 && gun <= 30) || (ay == 10 && gun <= 22) )
                burc = "terazi";

            else if ( (ay == 10) && (gun > 22 && gun <= 31) || (ay == 11 && gun < 22) )
                burc = "akrep";

            else if( (ay == 11) &&(gun >= 22 && gun <= 30) || (ay == 12 &&gun < 22) )
                burc = "yay";

            else
                System.out.println("Tarih bulunamadı.Doğum gününüzü 1-31 arasında giriniz.");
        }

        System.out.println("Burcunuz: "+ burc);
    }
}
