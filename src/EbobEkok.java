import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 Sayisini Giriniz : ");
        int n1 = inp.nextInt();

        System.out.print("n2 Sayisini Giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1;

        int i=1;
        while (i<=(n1*n2)) {
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("EKOK : " + i);
                break;
            }
            i++;
        }
        int y=1;
        while (y<=n1) {
            if (n1 % y == 0 && n2 % y == 0) {
                ebob = y;
            }
            y++;
        }
        System.out.println("EBOB : " + ebob);
    }
}
