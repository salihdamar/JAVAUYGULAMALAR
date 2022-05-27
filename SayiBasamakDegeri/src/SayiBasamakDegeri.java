import java.util.Scanner;

public class SayiBasamakDegeri {
    public static void main(String[] args) {

        /** Ödev:Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
         * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        int sayi, geciciSayi, toplam=0, basamakDegeri;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        sayi=sc.nextInt();
        geciciSayi=sayi;


        while (sayi != 0){
            basamakDegeri=sayi%10;
            toplam+=basamakDegeri;
            sayi/=10;
        }
            System.out.println( geciciSayi+" sayısının basamak sayıların toplamı: "+toplam);
    }
}
