import java.util.Scanner;

public class CiftVeDordunKati {
    public static void main(String[] args) {
        /** Ödev:
         * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
         * çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        int girilenSayi,toplam=0;

        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Bir sayı Giriniz");
            girilenSayi=sc.nextInt();

            if ((girilenSayi % 2 ==0) && (girilenSayi % 4 ==0) ){
                toplam+=girilenSayi;
            }
        }while(!(girilenSayi % 2==1));

        System.out.println("Girilen Sayıların Toplamı: " + toplam);
    }
}
