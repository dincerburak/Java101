public class AsalSayıBulma {
    public static void main(String[] args) {
        int sayac = 0, i, sayi;

        for (sayi=2;sayi<=100; sayi++) {
            boolean remind = true;
            for (i=2; i<sayi; i++) {
                if (sayi % i == 0) {
                    remind = false;
                    break;
                }
            }if (remind == true) {
                System.out.println("\n" + sayi);
                sayac++;
            }
        }
    }
}
