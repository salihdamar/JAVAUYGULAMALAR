import java.util.Scanner;

public class UceDorteTamBolunen {
    public static void main(String[] args) {
        /** Ödev: Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
         * sayıların ortalamasını hesaplayan programı yazınız.
         */

        int girilenSayi, i=0, sayac=0, topla=0, ortalama;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı Giriniz");
        girilenSayi=sc.nextInt();

        while (i<=girilenSayi){
                if (i%3==0 && i%4==0 ){
                    topla+=i;
                    sayac++;
                }
            i++;
        }
        ortalama=topla/sayac;
        System.out.println("3'e ve 4'e Tam Bölünen Sayiların Ortalaması: " +ortalama);
    }
}
