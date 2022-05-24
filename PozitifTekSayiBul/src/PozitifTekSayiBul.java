import java.util.Scanner;

public class PozitifTekSayiBul {
    public static void main(String[] args) {
        /** Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
         *  ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazınız.
         */

        int girilenSayi,toplam=0;

        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Bir sayı Giriniz");
            girilenSayi=sc.nextInt();

            if (girilenSayi % 2 ==1){
                toplam+=girilenSayi;
            }
        }while(0<girilenSayi);

        System.out.println("Girilen Sayıların Toplamı: " + toplam);
    }
}
