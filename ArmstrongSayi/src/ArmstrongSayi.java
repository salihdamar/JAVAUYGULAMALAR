import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        /** Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazınız.
         *
         * Armstrong Sayı Nedir ?:N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının
         * kendisine eşitse, böyle sayılara Armstrong sayı denir.
         * Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
         * Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         *
         * 1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit
         * olmadığı için armstrong sayı olmaz.
         * 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
         *
         * 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
         */
        int sayi, geciciSayi, toplam=0;
        int basamakSayisi=0, basamakDegeri;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        sayi=sc.nextInt();

        geciciSayi=sayi;
        while (geciciSayi != 0){
            geciciSayi /= 10;
            basamakSayisi++;
        }

        geciciSayi=sayi;
        while (geciciSayi != 0){
            basamakDegeri=geciciSayi%10;

            int basamakUssu=1;
            for (int i=1; i<=basamakSayisi; i++){
                basamakUssu*=basamakDegeri;
            }

            toplam+=basamakUssu;
            geciciSayi/=10;
        }

        if (toplam==sayi){
            System.out.println( sayi+" sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println( sayi+" sayısı bir Armstrong sayı değildir.");
        }
    }
}
