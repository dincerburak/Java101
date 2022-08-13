import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r;
        int nToplam=1, rToplam=1,nrToplam=1;
        double kombinasyon;

        Scanner sc=new Scanner(System.in);

        System.out.print("Eleman Sayisi(n) Giriniz Giriniz : ");
        n=sc.nextInt();
        System.out.print("Alt Kumenin Eleman Sayisi(r) Giriniz : ");
        r=sc.nextInt();

        int nr=n-r;

        for (int i=1; i<=n; i++){
            nToplam*=i;
        }

        for (int i=1; i<=r; i++){
            rToplam*=i;
        }

        for (int i=1; i<=nr; i++){
            nrToplam*=i;
        }

        kombinasyon=nToplam/(rToplam*nrToplam);
        System.out.println(n+ "'in "+r+"'li kombinasyonu C("+n+","+ r+"): "+ kombinasyon);
    }
}
