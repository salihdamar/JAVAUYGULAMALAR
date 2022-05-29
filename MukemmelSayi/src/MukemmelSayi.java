import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        /** Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
         * ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı
         * Java dilinde yazınız.
         *
         * Mükemmel Sayı Nedir ?: Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
         * sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        int sayi, carpanToplam=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();

        for(int i=1; i<sayi; i++){
            if (sayi % i==0) {
                carpanToplam+=i;
            }
        }

        if (carpanToplam==sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
