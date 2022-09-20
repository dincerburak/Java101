import java.util.Arrays;

public class CiftSayilariBulanProg {
        static boolean isFind(int[] arr, int value) {

            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;


        }

        public static void main(String[] args) {

            int[] list = {2,1,3,4,5,6,7,8,9,10,11,12,13,3,5,6,10,2,22,26,2,20,30,30,22,20,1};
            int[] ciftsayi = new int[list.length];
            int baslangic = 0;

            for (int i = 0; i < list.length; i++) {

                for (int j = 0; j < list.length; j++) {

                    if ((i != j) && (list[i] == list[j])) {
                        if (!isFind(ciftsayi, list[i])) {
                            ciftsayi[baslangic++] = list[i];
                            break;
                        }
                    }
                }
            }
            for (int value : ciftsayi) {
                if ((value != 0) && (value % 2 != 1)) {
                    System.out.println(value);
                }
            }

        }
    }